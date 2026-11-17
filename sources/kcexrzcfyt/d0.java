package kcexrzcfyt;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.ImageWriter;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class d0 implements z {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    ImageWriter f54650btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private DeferrableSurface f54651dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f54652eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f54653gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zdlpuopuiu.pmvmpeiblj f54654iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    androidx.camera.core.vdvldrhtss f54655lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private istkbnxepw.nufgyqmvbu f54656nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f54657ppxfxbqfkf = false;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f54658wkgbmnqykc = false;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    final hcddaimhww.eablkybsjg f54659zoijcleaow;

    class iobyxmoadg extends CameraCaptureSession.StateCallback {
        iobyxmoadg() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Surface inputSurface = cameraCaptureSession.getInputSurface();
            if (inputSurface != null) {
                d0.this.f54650btonecajqb = wwaezpbzkn.iobyxmoadg.ppxfxbqfkf(inputSurface, 1);
            }
        }
    }

    d0(zdlpuopuiu.pmvmpeiblj pmvmpeibljVar) {
        this.f54652eablkybsjg = false;
        this.f54653gxszxtbevo = false;
        this.f54654iobyxmoadg = pmvmpeibljVar;
        this.f54652eablkybsjg = e0.iobyxmoadg(pmvmpeibljVar, 4);
        this.f54653gxszxtbevo = androidx.camera.camera2.internal.compat.quirk.zoijcleaow.zoijcleaow(ZslDisablerQuirk.class) != null;
        this.f54659zoijcleaow = new hcddaimhww.eablkybsjg(3, new hcddaimhww.zoijcleaow() { // from class: kcexrzcfyt.b0
            @Override // hcddaimhww.zoijcleaow
            public final void iobyxmoadg(Object obj) {
                ((androidx.camera.core.agtfadlqog) obj).close();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void dxjokdxxww(istkbnxepw.cllcsxoeiz cllcsxoeizVar) {
        try {
            androidx.camera.core.agtfadlqog agtfadlqogVarPpxfxbqfkf = cllcsxoeizVar.ppxfxbqfkf();
            if (agtfadlqogVarPpxfxbqfkf != null) {
                this.f54659zoijcleaow.wkgbmnqykc(agtfadlqogVarPpxfxbqfkf);
            }
        } catch (IllegalStateException e13) {
            lereixgezr.sopmlzcsov.ppxfxbqfkf("ZslControlImpl", "Failed to acquire latest image IllegalStateException = " + e13.getMessage());
        }
    }

    private void gxszxtbevo() {
        hcddaimhww.eablkybsjg eablkybsjgVar = this.f54659zoijcleaow;
        while (!eablkybsjgVar.ppxfxbqfkf()) {
            ((androidx.camera.core.agtfadlqog) eablkybsjgVar.iobyxmoadg()).close();
        }
        DeferrableSurface deferrableSurface = this.f54651dxjokdxxww;
        if (deferrableSurface != null) {
            androidx.camera.core.vdvldrhtss vdvldrhtssVar = this.f54655lqeggnwhkg;
            if (vdvldrhtssVar != null) {
                deferrableSurface.gtknphoqwx().iobyxmoadg(new a0(vdvldrhtssVar), yadqdtsiqt.iobyxmoadg.wkgbmnqykc());
                this.f54655lqeggnwhkg = null;
            }
            deferrableSurface.wkgbmnqykc();
            this.f54651dxjokdxxww = null;
        }
        ImageWriter imageWriter = this.f54650btonecajqb;
        if (imageWriter != null) {
            imageWriter.close();
            this.f54650btonecajqb = null;
        }
    }

    private Map lqeggnwhkg(zdlpuopuiu.pmvmpeiblj pmvmpeibljVar) {
        StreamConfigurationMap streamConfigurationMap;
        try {
            streamConfigurationMap = (StreamConfigurationMap) pmvmpeibljVar.iobyxmoadg(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e13) {
            lereixgezr.sopmlzcsov.ppxfxbqfkf("ZslControlImpl", "Failed to retrieve StreamConfigurationMap, error = " + e13.getMessage());
            streamConfigurationMap = null;
        }
        if (streamConfigurationMap == null || streamConfigurationMap.getInputFormats() == null) {
            return new HashMap();
        }
        HashMap map = new HashMap();
        for (int i13 : streamConfigurationMap.getInputFormats()) {
            Size[] inputSizes = streamConfigurationMap.getInputSizes(i13);
            if (inputSizes != null) {
                Arrays.sort(inputSizes, new cdpycssgdh.wkgbmnqykc(true));
                map.put(Integer.valueOf(i13), inputSizes[0]);
            }
        }
        return map;
    }

    private boolean nufgyqmvbu(zdlpuopuiu.pmvmpeiblj pmvmpeibljVar, int i13) {
        int[] validOutputFormatsForInput;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) pmvmpeibljVar.iobyxmoadg(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null || (validOutputFormatsForInput = streamConfigurationMap.getValidOutputFormatsForInput(i13)) == null) {
            return false;
        }
        for (int i14 : validOutputFormatsForInput) {
            if (i14 == 256) {
                return true;
            }
        }
        return false;
    }

    @Override // kcexrzcfyt.z
    public void iobyxmoadg(androidx.camera.core.impl.jyumaefscl.zoijcleaow zoijcleaowVar) {
        gxszxtbevo();
        if (this.f54657ppxfxbqfkf) {
            zoijcleaowVar.esjtqupxsv(1);
            return;
        }
        if (this.f54653gxszxtbevo) {
            zoijcleaowVar.esjtqupxsv(1);
            return;
        }
        Map mapLqeggnwhkg = lqeggnwhkg(this.f54654iobyxmoadg);
        if (!this.f54652eablkybsjg || mapLqeggnwhkg.isEmpty() || !mapLqeggnwhkg.containsKey(34) || !nufgyqmvbu(this.f54654iobyxmoadg, 34)) {
            zoijcleaowVar.esjtqupxsv(1);
            return;
        }
        Size size = (Size) mapLqeggnwhkg.get(34);
        androidx.camera.core.rgvfuqvkyq rgvfuqvkyqVar = new androidx.camera.core.rgvfuqvkyq(size.getWidth(), size.getHeight(), 34, 9);
        this.f54656nufgyqmvbu = rgvfuqvkyqVar.agtfadlqog();
        this.f54655lqeggnwhkg = new androidx.camera.core.vdvldrhtss(rgvfuqvkyqVar);
        rgvfuqvkyqVar.lqeggnwhkg(new istkbnxepw.cllcsxoeiz.iobyxmoadg() { // from class: kcexrzcfyt.c0
            @Override // istkbnxepw.cllcsxoeiz.iobyxmoadg
            public final void iobyxmoadg(istkbnxepw.cllcsxoeiz cllcsxoeizVar) {
                this.f54614iobyxmoadg.dxjokdxxww(cllcsxoeizVar);
            }
        }, yadqdtsiqt.iobyxmoadg.ppxfxbqfkf());
        istkbnxepw.dsvhmnatus dsvhmnatusVar = new istkbnxepw.dsvhmnatus(this.f54655lqeggnwhkg.iobyxmoadg(), new Size(this.f54655lqeggnwhkg.getWidth(), this.f54655lqeggnwhkg.getHeight()), 34);
        this.f54651dxjokdxxww = dsvhmnatusVar;
        androidx.camera.core.vdvldrhtss vdvldrhtssVar = this.f54655lqeggnwhkg;
        com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVarGtknphoqwx = dsvhmnatusVar.gtknphoqwx();
        Objects.requireNonNull(vdvldrhtssVar);
        wkgbmnqykcVarGtknphoqwx.iobyxmoadg(new a0(vdvldrhtssVar), yadqdtsiqt.iobyxmoadg.wkgbmnqykc());
        zoijcleaowVar.wflxmlrfwp(this.f54651dxjokdxxww);
        zoijcleaowVar.eablkybsjg(this.f54656nufgyqmvbu);
        zoijcleaowVar.draadjrbmk(new iobyxmoadg());
        zoijcleaowVar.yggfygwlhe(new InputConfiguration(this.f54655lqeggnwhkg.getWidth(), this.f54655lqeggnwhkg.getHeight(), this.f54655lqeggnwhkg.wkgbmnqykc()));
    }

    @Override // kcexrzcfyt.z
    public void ppxfxbqfkf(boolean z13) {
        this.f54657ppxfxbqfkf = z13;
    }

    @Override // kcexrzcfyt.z
    public void zoijcleaow(boolean z13) {
        this.f54658wkgbmnqykc = z13;
    }
}
