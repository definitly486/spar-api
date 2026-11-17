package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureRequest;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.jyumaefscl;
import istkbnxepw.ribwqtqdhb;
import istkbnxepw.ydmasvzmpa;
import istkbnxepw.yfnezrywwk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lereixgezr.sopmlzcsov;

/* JADX INFO: loaded from: classes.dex */
abstract class oxmwwwfdhm implements yfnezrywwk, androidx.camera.extensions.zoijcleaow, androidx.camera.extensions.iobyxmoadg {
    protected static final int EXTENSION_STRENGTH_UNKNOWN = -1;
    private static final String TAG = "SessionProcessorBase";
    private String mCameraId;
    private HandlerThread mImageReaderHandlerThread;
    private final Set<Integer> mSupportedCameraOperations;
    private final Map<Integer, ImageReader> mImageReaderMap = new HashMap();
    private final Map<Integer, gxszxtbevo> mOutputConfigMap = new HashMap();
    private final List<DeferrableSurface> mSurfacesList = new ArrayList();
    protected final Object mLock = new Object();
    protected int mExtensionStrength = -1;

    private static class iobyxmoadg implements draadjrbmk {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Image f4064zoijcleaow;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final Object f4063ppxfxbqfkf = new Object();

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private int f4062iobyxmoadg = 1;

        iobyxmoadg(Image image) {
            this.f4064zoijcleaow = image;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.draadjrbmk
        public Image get() {
            return this.f4064zoijcleaow;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.draadjrbmk
        public boolean iobyxmoadg() {
            synchronized (this.f4063ppxfxbqfkf) {
                try {
                    int i13 = this.f4062iobyxmoadg;
                    if (i13 <= 0) {
                        return false;
                    }
                    this.f4062iobyxmoadg = i13 + 1;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.draadjrbmk
        public boolean zoijcleaow() {
            synchronized (this.f4063ppxfxbqfkf) {
                try {
                    int i13 = this.f4062iobyxmoadg;
                    if (i13 <= 0) {
                        return false;
                    }
                    int i14 = i13 - 1;
                    this.f4062iobyxmoadg = i14;
                    if (i14 <= 0) {
                        this.f4064zoijcleaow.close();
                    }
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    oxmwwwfdhm(List list) {
        this.mSupportedCameraOperations = wkgbmnqykc(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void gxszxtbevo(gtknphoqwx gtknphoqwxVar, int i13, String str, ImageReader imageReader) {
        try {
            Image imageAcquireNextImage = imageReader.acquireNextImage();
            gtknphoqwxVar.onNextImageAvailable(i13, imageAcquireNextImage.getTimestamp(), new iobyxmoadg(imageAcquireNextImage), str);
        } catch (IllegalStateException e13) {
            sopmlzcsov.wkgbmnqykc(TAG, "Failed to acquire next image.", e13);
        }
    }

    private static ydmasvzmpa ppxfxbqfkf(gxszxtbevo gxszxtbevoVar, Map map) {
        if (gxszxtbevoVar instanceof SurfaceOutputConfig) {
            return new ydmasvzmpa(((SurfaceOutputConfig) gxszxtbevoVar).getSurface(), gxszxtbevoVar.getId());
        }
        if (gxszxtbevoVar instanceof ImageReaderOutputConfig) {
            ImageReaderOutputConfig imageReaderOutputConfig = (ImageReaderOutputConfig) gxszxtbevoVar;
            final ImageReader imageReaderNewInstance = ImageReader.newInstance(imageReaderOutputConfig.getSize().getWidth(), imageReaderOutputConfig.getSize().getHeight(), imageReaderOutputConfig.getImageFormat(), imageReaderOutputConfig.getMaxImages());
            map.put(Integer.valueOf(gxszxtbevoVar.getId()), imageReaderNewInstance);
            ydmasvzmpa ydmasvzmpaVar = new ydmasvzmpa(imageReaderNewInstance.getSurface(), gxszxtbevoVar.getId());
            ydmasvzmpaVar.gtknphoqwx().iobyxmoadg(new Runnable() { // from class: androidx.camera.extensions.internal.sessionprocessor.vdvldrhtss
                @Override // java.lang.Runnable
                public final void run() {
                    imageReaderNewInstance.close();
                }
            }, yadqdtsiqt.iobyxmoadg.iobyxmoadg());
            return ydmasvzmpaVar;
        }
        if (gxszxtbevoVar instanceof MultiResolutionImageReaderOutputConfig) {
            throw new UnsupportedOperationException("MultiResolutionImageReader not supported yet");
        }
        throw new UnsupportedOperationException("Unsupported Camera2OutputConfig:" + gxszxtbevoVar);
    }

    private Set wkgbmnqykc(List list) {
        HashSet hashSet = new HashSet();
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 30) {
            if (list.contains(CaptureRequest.CONTROL_ZOOM_RATIO) || list.contains(CaptureRequest.SCALER_CROP_REGION)) {
                hashSet.add(0);
            }
        } else if (list.contains(CaptureRequest.SCALER_CROP_REGION)) {
            hashSet.add(0);
        }
        if (list.containsAll(Arrays.asList(CaptureRequest.CONTROL_AF_TRIGGER, CaptureRequest.CONTROL_AF_MODE))) {
            hashSet.add(1);
        }
        if (list.contains(CaptureRequest.CONTROL_AF_REGIONS)) {
            hashSet.add(2);
        }
        if (list.contains(CaptureRequest.CONTROL_AE_REGIONS)) {
            hashSet.add(3);
        }
        if (list.contains(CaptureRequest.CONTROL_AWB_REGIONS)) {
            hashSet.add(4);
        }
        CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
        if (list.containsAll(Arrays.asList(key, CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER))) {
            hashSet.add(5);
        }
        if (list.containsAll(Arrays.asList(key, CaptureRequest.FLASH_MODE))) {
            hashSet.add(6);
        }
        if (list.contains(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION)) {
            hashSet.add(7);
        }
        if (i13 >= 34 && list.contains(CaptureRequest.EXTENSION_STRENGTH)) {
            hashSet.add(8);
        }
        return hashSet;
    }

    @Override // istkbnxepw.yfnezrywwk
    public final void deInitSession() {
        sopmlzcsov.ppxfxbqfkf(TAG, "deInitSession: cameraId=" + this.mCameraId);
        deInitSessionInternal();
        synchronized (this.mLock) {
            try {
                Iterator<DeferrableSurface> it = this.mSurfacesList.iterator();
                while (it.hasNext()) {
                    it.next().wkgbmnqykc();
                }
                this.mSurfacesList.clear();
                this.mImageReaderMap.clear();
                this.mOutputConfigMap.clear();
                this.mExtensionStrength = -1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        HandlerThread handlerThread = this.mImageReaderHandlerThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.mImageReaderHandlerThread = null;
        }
    }

    protected abstract void deInitSessionInternal();

    @Override // istkbnxepw.yfnezrywwk
    public Set getSupportedCameraOperations() {
        return this.mSupportedCameraOperations;
    }

    @Override // istkbnxepw.yfnezrywwk
    public final jyumaefscl initSession(lereixgezr.agtfadlqog agtfadlqogVar, ribwqtqdhb ribwqtqdhbVar) {
        istkbnxepw.jyumaefscl jyumaefsclVar = (istkbnxepw.jyumaefscl) agtfadlqogVar;
        nufgyqmvbu nufgyqmvbuVarInitSessionInternal = initSessionInternal(jyumaefsclVar.zoijcleaow(), androidx.camera.extensions.internal.lqeggnwhkg.iobyxmoadg(jyumaefsclVar), ribwqtqdhbVar);
        jyumaefscl.zoijcleaow zoijcleaowVar = new jyumaefscl.zoijcleaow();
        synchronized (this.mLock) {
            try {
                for (gxszxtbevo gxszxtbevoVar : nufgyqmvbuVarInitSessionInternal.gxszxtbevo()) {
                    ydmasvzmpa ydmasvzmpaVarPpxfxbqfkf = ppxfxbqfkf(gxszxtbevoVar, this.mImageReaderMap);
                    this.mSurfacesList.add(ydmasvzmpaVarPpxfxbqfkf);
                    this.mOutputConfigMap.put(Integer.valueOf(gxszxtbevoVar.getId()), gxszxtbevoVar);
                    jyumaefscl.gxszxtbevo.iobyxmoadg iobyxmoadgVarGxszxtbevo = jyumaefscl.gxszxtbevo.iobyxmoadg(ydmasvzmpaVarPpxfxbqfkf).wkgbmnqykc(gxszxtbevoVar.getPhysicalCameraId()).gxszxtbevo(gxszxtbevoVar.getSurfaceGroupId());
                    List<gxszxtbevo> surfaceSharingOutputConfigs = gxszxtbevoVar.getSurfaceSharingOutputConfigs();
                    if (surfaceSharingOutputConfigs != null && !surfaceSharingOutputConfigs.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        for (gxszxtbevo gxszxtbevoVar2 : surfaceSharingOutputConfigs) {
                            this.mOutputConfigMap.put(Integer.valueOf(gxszxtbevoVar2.getId()), gxszxtbevoVar2);
                            arrayList.add(ppxfxbqfkf(gxszxtbevoVar2, this.mImageReaderMap));
                        }
                        iobyxmoadgVarGxszxtbevo.eablkybsjg(arrayList);
                    }
                    zoijcleaowVar.btonecajqb(iobyxmoadgVarGxszxtbevo.iobyxmoadg());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        androidx.camera.extensions.internal.nufgyqmvbu.zoijcleaow zoijcleaowVar2 = new androidx.camera.extensions.internal.nufgyqmvbu.zoijcleaow();
        for (CaptureRequest.Key key : nufgyqmvbuVarInitSessionInternal.wkgbmnqykc().keySet()) {
            zoijcleaowVar2.eablkybsjg(key, nufgyqmvbuVarInitSessionInternal.wkgbmnqykc().get(key));
        }
        zoijcleaowVar.zdlpuopuiu(zoijcleaowVar2.zoijcleaow());
        zoijcleaowVar.esjtqupxsv(nufgyqmvbuVarInitSessionInternal.eablkybsjg());
        zoijcleaowVar.cqumvgiudr(nufgyqmvbuVarInitSessionInternal.ppxfxbqfkf());
        HandlerThread handlerThread = new HandlerThread("CameraX-extensions_image_reader");
        this.mImageReaderHandlerThread = handlerThread;
        handlerThread.start();
        this.mCameraId = jyumaefsclVar.zoijcleaow();
        sopmlzcsov.iobyxmoadg(TAG, "initSession: cameraId=" + this.mCameraId);
        return zoijcleaowVar.rgvfuqvkyq();
    }

    protected abstract nufgyqmvbu initSessionInternal(String str, Map map, ribwqtqdhb ribwqtqdhbVar);

    protected void setImageProcessor(final int i13, final gtknphoqwx gtknphoqwxVar) {
        ImageReader imageReader;
        final String physicalCameraId;
        synchronized (this.mLock) {
            imageReader = this.mImageReaderMap.get(Integer.valueOf(i13));
            gxszxtbevo gxszxtbevoVar = this.mOutputConfigMap.get(Integer.valueOf(i13));
            physicalCameraId = gxszxtbevoVar == null ? null : gxszxtbevoVar.getPhysicalCameraId();
        }
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: androidx.camera.extensions.internal.sessionprocessor.rgvfuqvkyq
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader2) {
                    oxmwwwfdhm.gxszxtbevo(gtknphoqwxVar, i13, physicalCameraId, imageReader2);
                }
            }, new Handler(this.mImageReaderHandlerThread.getLooper()));
        }
    }
}
