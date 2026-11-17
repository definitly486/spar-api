package androidx.camera.extensions;

import androidx.camera.extensions.impl.InitializerImpl;
import lereixgezr.ojitshcjhn;
import lereixgezr.sopmlzcsov;

/* JADX INFO: loaded from: classes.dex */
public final class ExtensionsManager {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Object f3984ppxfxbqfkf = new Object();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static ExtensionsManager f3985wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ExtensionsAvailability f3986iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wkgbmnqykc f3987zoijcleaow;

    /* JADX INFO: renamed from: androidx.camera.extensions.ExtensionsManager$1, reason: invalid class name */
    class AnonymousClass1 implements InitializerImpl.OnExtensionsInitializedCallback {
        final /* synthetic */ ojitshcjhn val$cameraProvider;
        final /* synthetic */ androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg val$completer;

        AnonymousClass1(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar, ojitshcjhn ojitshcjhnVar) {
            this.val$completer = iobyxmoadgVar;
            this.val$cameraProvider = ojitshcjhnVar;
        }

        public void onFailure(int i13) {
            sopmlzcsov.ppxfxbqfkf("ExtensionsManager", "Failed to initialize extensions");
            this.val$completer.ppxfxbqfkf(ExtensionsManager.iobyxmoadg(ExtensionsAvailability.LIBRARY_UNAVAILABLE_ERROR_LOADING, this.val$cameraProvider));
        }

        public void onSuccess() {
            sopmlzcsov.iobyxmoadg("ExtensionsManager", "Successfully initialized extensions");
            this.val$completer.ppxfxbqfkf(ExtensionsManager.iobyxmoadg(ExtensionsAvailability.LIBRARY_AVAILABLE, this.val$cameraProvider));
        }
    }

    /* JADX INFO: renamed from: androidx.camera.extensions.ExtensionsManager$2, reason: invalid class name */
    class AnonymousClass2 implements InitializerImpl.OnExtensionsDeinitializedCallback {
        final /* synthetic */ androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg val$completer;

        AnonymousClass2(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
            this.val$completer = iobyxmoadgVar;
        }

        public void onFailure(int i13) {
            this.val$completer.gxszxtbevo(new Exception("Failed to deinitialize extensions."));
        }

        public void onSuccess() {
            this.val$completer.ppxfxbqfkf(null);
        }
    }

    enum ExtensionsAvailability {
        LIBRARY_AVAILABLE,
        LIBRARY_UNAVAILABLE_ERROR_LOADING,
        LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION,
        NONE
    }

    private ExtensionsManager(ExtensionsAvailability extensionsAvailability, ojitshcjhn ojitshcjhnVar) {
        this.f3986iobyxmoadg = extensionsAvailability;
        this.f3987zoijcleaow = new wkgbmnqykc(ojitshcjhnVar);
    }

    static ExtensionsManager iobyxmoadg(ExtensionsAvailability extensionsAvailability, ojitshcjhn ojitshcjhnVar) {
        synchronized (f3984ppxfxbqfkf) {
            try {
                ExtensionsManager extensionsManager = f3985wkgbmnqykc;
                if (extensionsManager != null) {
                    return extensionsManager;
                }
                ExtensionsManager extensionsManager2 = new ExtensionsManager(extensionsAvailability, ojitshcjhnVar);
                f3985wkgbmnqykc = extensionsManager2;
                return extensionsManager2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
