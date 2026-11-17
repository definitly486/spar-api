package com.yandex.runtime.view;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import com.yandex.runtime.graphics_state.GraphicsViewState;
import com.yandex.runtime.graphics_state.GraphicsViewType;
import com.yandex.runtime.logging.Logger;
import com.yandex.runtime.vulkan_launcher.VulkanLauncher;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import of.iobyxmoadg;

/* JADX INFO: loaded from: classes3.dex */
public class PlatformViewFactory {
    private static final Set<String> VULKAN_WHITE_LIST = new HashSet(Arrays.asList("Nexus 5X"));

    public enum Attribute {
        MOVABLE,
        NONINTERACTIVE,
        RENDER_DEBUG,
        VULKAN_ENABLED
    }

    public static final Set<Attribute> convertAttributeSet(Context context, AttributeSet attributeSet) {
        HashSet hashSet = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, iobyxmoadg.PlatformView, 0, 0);
        try {
            if (typedArrayObtainStyledAttributes.getBoolean(iobyxmoadg.PlatformView_movable, false)) {
                hashSet.add(Attribute.MOVABLE);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(iobyxmoadg.PlatformView_noninteractive, false)) {
                hashSet.add(Attribute.NONINTERACTIVE);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(iobyxmoadg.PlatformView_renderDebug, false)) {
                hashSet.add(Attribute.RENDER_DEBUG);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(iobyxmoadg.PlatformView_vulkanPreferred, false)) {
                hashSet.add(Attribute.VULKAN_ENABLED);
            }
            return hashSet;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private static PlatformGLSurfaceView createGLSurfaceView(Context context, Boolean bool) {
        return Build.VERSION.SDK_INT >= 34 ? new PlatformGLSurfaceView(context, bool.booleanValue()) : new PlatformGLSurfaceViewBelowApi34Workaround(context, bool.booleanValue());
    }

    public static PlatformView getPlatformView(Context context, Set<Attribute> set) {
        PlatformView platformVulkanSurfaceView;
        if (set == null) {
            set = new HashSet<>();
        }
        boolean zContains = set.contains(Attribute.RENDER_DEBUG);
        boolean zIsAndroidGo = isAndroidGo(context);
        if (zIsAndroidGo) {
            Logger.warn("Android Go detected. Do not use vulkan.");
        }
        boolean z13 = set.contains(Attribute.VULKAN_ENABLED) || VulkanLauncher.isVulkanEnabled();
        if (!z13) {
            Logger.warn("Vulkan is not enabled. Do not use vulkan.");
        }
        if (set.contains(Attribute.MOVABLE)) {
            GraphicsViewState.logViewCreateAttempt(GraphicsViewType.OPEN_GL);
            platformVulkanSurfaceView = new PlatformGLTextureView(context, zContains);
        } else if (zIsAndroidGo || !z13) {
            platformVulkanSurfaceView = null;
        } else {
            GraphicsViewState.logViewCreateAttempt(GraphicsViewType.VULKAN);
            try {
                platformVulkanSurfaceView = new PlatformVulkanSurfaceView(context, zContains);
            } catch (RuntimeException e13) {
                Logger.error("Failed to create Vulkan view: " + e13.getMessage());
                Logger.error("Falling back to OpenGL view");
                platformVulkanSurfaceView = null;
            }
        }
        if (platformVulkanSurfaceView == null) {
            GraphicsViewState.logViewCreateAttempt(GraphicsViewType.OPEN_GL);
            platformVulkanSurfaceView = createGLSurfaceView(context, Boolean.valueOf(zContains));
        }
        if (set.contains(Attribute.NONINTERACTIVE)) {
            platformVulkanSurfaceView.setNoninteractive(true);
        }
        return platformVulkanSurfaceView;
    }

    private static boolean isAndroidGo(Context context) {
        return ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
    }
}
