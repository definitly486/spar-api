package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.function.Consumer;
import kotlin.jvm.internal.cllcsxoeiz;

/* JADX INFO: loaded from: classes2.dex */
public final class rgvfuqvkyq {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final rgvfuqvkyq f13829iobyxmoadg = new rgvfuqvkyq();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final gg.gtknphoqwx f13830zoijcleaow = gg.draadjrbmk.zoijcleaow(eablkybsjg.f13831zdlpuopuiu);

    static final class eablkybsjg extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final eablkybsjg f13831zdlpuopuiu = new eablkybsjg();

        eablkybsjg() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final WindowLayoutComponent invoke() {
            ClassLoader classLoader = rgvfuqvkyq.class.getClassLoader();
            if (classLoader == null || !rgvfuqvkyq.f13829iobyxmoadg.dxjokdxxww(classLoader)) {
                return null;
            }
            try {
                return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
            } catch (UnsupportedOperationException unused) {
                return null;
            }
        }
    }

    static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ ClassLoader f13832zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(ClassLoader classLoader) {
            super(0);
            this.f13832zdlpuopuiu = classLoader;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0060  */
        @Override // tg.iobyxmoadg
        public final Boolean invoke() throws NoSuchMethodException {
            boolean z13;
            rgvfuqvkyq rgvfuqvkyqVar = rgvfuqvkyq.f13829iobyxmoadg;
            Class clsDraadjrbmk = rgvfuqvkyqVar.draadjrbmk(this.f13832zdlpuopuiu);
            Method getBoundsMethod = clsDraadjrbmk.getMethod("getBounds", null);
            Method getTypeMethod = clsDraadjrbmk.getMethod("getType", null);
            Method getStateMethod = clsDraadjrbmk.getMethod("getState", null);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(getBoundsMethod, "getBoundsMethod");
            if (rgvfuqvkyqVar.btonecajqb(getBoundsMethod, cllcsxoeiz.zoijcleaow(Rect.class)) && rgvfuqvkyqVar.ojitshcjhn(getBoundsMethod)) {
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(getTypeMethod, "getTypeMethod");
                Class cls = Integer.TYPE;
                if (rgvfuqvkyqVar.btonecajqb(getTypeMethod, cllcsxoeiz.zoijcleaow(cls)) && rgvfuqvkyqVar.ojitshcjhn(getTypeMethod)) {
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(getStateMethod, "getStateMethod");
                    if (rgvfuqvkyqVar.btonecajqb(getStateMethod, cllcsxoeiz.zoijcleaow(cls)) && rgvfuqvkyqVar.ojitshcjhn(getStateMethod)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                } else {
                    z13 = false;
                }
            } else {
                z13 = false;
            }
            return Boolean.valueOf(z13);
        }
    }

    static final class ppxfxbqfkf extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ ClassLoader f13833zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(ClassLoader classLoader) {
            super(0);
            this.f13833zdlpuopuiu = classLoader;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0038  */
        @Override // tg.iobyxmoadg
        public final Boolean invoke() throws NoSuchMethodException {
            boolean z13;
            rgvfuqvkyq rgvfuqvkyqVar = rgvfuqvkyq.f13829iobyxmoadg;
            Class clsJyumaefscl = rgvfuqvkyqVar.jyumaefscl(this.f13833zdlpuopuiu);
            Method addListenerMethod = clsJyumaefscl.getMethod("addWindowLayoutInfoListener", Activity.class, Consumer.class);
            Method removeListenerMethod = clsJyumaefscl.getMethod("removeWindowLayoutInfoListener", Consumer.class);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(addListenerMethod, "addListenerMethod");
            if (rgvfuqvkyqVar.ojitshcjhn(addListenerMethod)) {
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(removeListenerMethod, "removeListenerMethod");
                if (rgvfuqvkyqVar.ojitshcjhn(removeListenerMethod)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
            } else {
                z13 = false;
            }
            return Boolean.valueOf(z13);
        }
    }

    static final class wkgbmnqykc extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ ClassLoader f13834zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(ClassLoader classLoader) {
            super(0);
            this.f13834zdlpuopuiu = classLoader;
        }

        @Override // tg.iobyxmoadg
        public final Boolean invoke() throws NoSuchMethodException {
            rgvfuqvkyq rgvfuqvkyqVar = rgvfuqvkyq.f13829iobyxmoadg;
            Method getWindowExtensionsMethod = rgvfuqvkyqVar.yggfygwlhe(this.f13834zdlpuopuiu).getDeclaredMethod("getWindowExtensions", null);
            Class windowExtensionsClass = rgvfuqvkyqVar.zdlpuopuiu(this.f13834zdlpuopuiu);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(getWindowExtensionsMethod, "getWindowExtensionsMethod");
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(windowExtensionsClass, "windowExtensionsClass");
            return Boolean.valueOf(rgvfuqvkyqVar.gtknphoqwx(getWindowExtensionsMethod, windowExtensionsClass) && rgvfuqvkyqVar.ojitshcjhn(getWindowExtensionsMethod));
        }
    }

    static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ ClassLoader f13835zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(ClassLoader classLoader) {
            super(0);
            this.f13835zdlpuopuiu = classLoader;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x002d  */
        @Override // tg.iobyxmoadg
        public final Boolean invoke() throws NoSuchMethodException {
            boolean z13;
            rgvfuqvkyq rgvfuqvkyqVar = rgvfuqvkyq.f13829iobyxmoadg;
            Method getWindowLayoutComponentMethod = rgvfuqvkyqVar.zdlpuopuiu(this.f13835zdlpuopuiu).getMethod("getWindowLayoutComponent", null);
            Class windowLayoutComponentClass = rgvfuqvkyqVar.jyumaefscl(this.f13835zdlpuopuiu);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(getWindowLayoutComponentMethod, "getWindowLayoutComponentMethod");
            if (rgvfuqvkyqVar.ojitshcjhn(getWindowLayoutComponentMethod)) {
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(windowLayoutComponentClass, "windowLayoutComponentClass");
                if (rgvfuqvkyqVar.gtknphoqwx(getWindowLayoutComponentMethod, windowLayoutComponentClass)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
            } else {
                z13 = false;
            }
            return Boolean.valueOf(z13);
        }
    }

    private rgvfuqvkyq() {
    }

    private final boolean agtfadlqog(ClassLoader classLoader) {
        return kcexrzcfyt(new iobyxmoadg(classLoader));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean btonecajqb(Method method, ah.wkgbmnqykc wkgbmnqykcVar) {
        return gtknphoqwx(method, sg.iobyxmoadg.zoijcleaow(wkgbmnqykcVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class draadjrbmk(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.FoldingFeature");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean dxjokdxxww(ClassLoader classLoader) {
        return oxmwwwfdhm(classLoader) && rgvfuqvkyq(classLoader) && vdvldrhtss(classLoader) && agtfadlqog(classLoader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean gtknphoqwx(Method method, Class cls) {
        return method.getReturnType().equals(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class jyumaefscl(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
    }

    private final boolean kcexrzcfyt(tg.iobyxmoadg iobyxmoadgVar) {
        try {
            return ((Boolean) iobyxmoadgVar.invoke()).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean ojitshcjhn(Method method) {
        return Modifier.isPublic(method.getModifiers());
    }

    private final boolean oxmwwwfdhm(ClassLoader classLoader) {
        return kcexrzcfyt(new wkgbmnqykc(classLoader));
    }

    private final boolean rgvfuqvkyq(ClassLoader classLoader) {
        return kcexrzcfyt(new zoijcleaow(classLoader));
    }

    private final boolean vdvldrhtss(ClassLoader classLoader) {
        return kcexrzcfyt(new ppxfxbqfkf(classLoader));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class yggfygwlhe(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class zdlpuopuiu(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensions");
    }

    public final WindowLayoutComponent wflxmlrfwp() {
        return (WindowLayoutComponent) f13830zoijcleaow.getValue();
    }
}
