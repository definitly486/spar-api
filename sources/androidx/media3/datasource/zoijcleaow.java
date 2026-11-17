package androidx.media3.datasource;

import android.content.Context;
import android.net.Uri;
import b3.lqeggnwhkg;
import b3.wflxmlrfwp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import y2.kcexrzcfyt;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow implements androidx.media3.datasource.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private androidx.media3.datasource.iobyxmoadg f10005btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private androidx.media3.datasource.iobyxmoadg f10006dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private androidx.media3.datasource.iobyxmoadg f10007eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private androidx.media3.datasource.iobyxmoadg f10008gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private androidx.media3.datasource.iobyxmoadg f10009gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f10010iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private androidx.media3.datasource.iobyxmoadg f10011lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private androidx.media3.datasource.iobyxmoadg f10012nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final androidx.media3.datasource.iobyxmoadg f10013ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private androidx.media3.datasource.iobyxmoadg f10014wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f10015zoijcleaow = new ArrayList();

    public static final class iobyxmoadg implements androidx.media3.datasource.iobyxmoadg.InterfaceC0162iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Context f10016iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private wflxmlrfwp f10017ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final androidx.media3.datasource.iobyxmoadg.InterfaceC0162iobyxmoadg f10018zoijcleaow;

        public iobyxmoadg(Context context) {
            this(context, new ppxfxbqfkf.zoijcleaow());
        }

        @Override // androidx.media3.datasource.iobyxmoadg.InterfaceC0162iobyxmoadg
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public zoijcleaow iobyxmoadg() {
            zoijcleaow zoijcleaowVar = new zoijcleaow(this.f10016iobyxmoadg, this.f10018zoijcleaow.iobyxmoadg());
            wflxmlrfwp wflxmlrfwpVar = this.f10017ppxfxbqfkf;
            if (wflxmlrfwpVar != null) {
                zoijcleaowVar.eablkybsjg(wflxmlrfwpVar);
            }
            return zoijcleaowVar;
        }

        public iobyxmoadg(Context context, androidx.media3.datasource.iobyxmoadg.InterfaceC0162iobyxmoadg interfaceC0162iobyxmoadg) {
            this.f10016iobyxmoadg = context.getApplicationContext();
            this.f10018zoijcleaow = (androidx.media3.datasource.iobyxmoadg.InterfaceC0162iobyxmoadg) y2.iobyxmoadg.eablkybsjg(interfaceC0162iobyxmoadg);
        }
    }

    public zoijcleaow(Context context, androidx.media3.datasource.iobyxmoadg iobyxmoadgVar) {
        this.f10010iobyxmoadg = context.getApplicationContext();
        this.f10013ppxfxbqfkf = (androidx.media3.datasource.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(iobyxmoadgVar);
    }

    private void cqumvgiudr(androidx.media3.datasource.iobyxmoadg iobyxmoadgVar, wflxmlrfwp wflxmlrfwpVar) {
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.eablkybsjg(wflxmlrfwpVar);
        }
    }

    private androidx.media3.datasource.iobyxmoadg iwizpuwonk() {
        if (this.f10012nufgyqmvbu == null) {
            UdpDataSource udpDataSource = new UdpDataSource();
            this.f10012nufgyqmvbu = udpDataSource;
            rgvfuqvkyq(udpDataSource);
        }
        return this.f10012nufgyqmvbu;
    }

    private androidx.media3.datasource.iobyxmoadg jyumaefscl() {
        if (this.f10011lqeggnwhkg == null) {
            try {
                androidx.media3.datasource.iobyxmoadg iobyxmoadgVar = (androidx.media3.datasource.iobyxmoadg) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                this.f10011lqeggnwhkg = iobyxmoadgVar;
                rgvfuqvkyq(iobyxmoadgVar);
            } catch (ClassNotFoundException unused) {
                kcexrzcfyt.nufgyqmvbu("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e13) {
                throw new RuntimeException("Error instantiating RTMP extension", e13);
            }
            if (this.f10011lqeggnwhkg == null) {
                this.f10011lqeggnwhkg = this.f10013ppxfxbqfkf;
            }
        }
        return this.f10011lqeggnwhkg;
    }

    private androidx.media3.datasource.iobyxmoadg kcexrzcfyt() {
        if (this.f10006dxjokdxxww == null) {
            b3.ppxfxbqfkf ppxfxbqfkfVar = new b3.ppxfxbqfkf();
            this.f10006dxjokdxxww = ppxfxbqfkfVar;
            rgvfuqvkyq(ppxfxbqfkfVar);
        }
        return this.f10006dxjokdxxww;
    }

    private androidx.media3.datasource.iobyxmoadg oxmwwwfdhm() {
        if (this.f10009gxszxtbevo == null) {
            ContentDataSource contentDataSource = new ContentDataSource(this.f10010iobyxmoadg);
            this.f10009gxszxtbevo = contentDataSource;
            rgvfuqvkyq(contentDataSource);
        }
        return this.f10009gxszxtbevo;
    }

    private void rgvfuqvkyq(androidx.media3.datasource.iobyxmoadg iobyxmoadgVar) {
        for (int i13 = 0; i13 < this.f10015zoijcleaow.size(); i13++) {
            iobyxmoadgVar.eablkybsjg((wflxmlrfwp) this.f10015zoijcleaow.get(i13));
        }
    }

    private androidx.media3.datasource.iobyxmoadg vdvldrhtss() {
        if (this.f10007eablkybsjg == null) {
            AssetDataSource assetDataSource = new AssetDataSource(this.f10010iobyxmoadg);
            this.f10007eablkybsjg = assetDataSource;
            rgvfuqvkyq(assetDataSource);
        }
        return this.f10007eablkybsjg;
    }

    private androidx.media3.datasource.iobyxmoadg yggfygwlhe() {
        if (this.f10005btonecajqb == null) {
            RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(this.f10010iobyxmoadg);
            this.f10005btonecajqb = rawResourceDataSource;
            rgvfuqvkyq(rawResourceDataSource);
        }
        return this.f10005btonecajqb;
    }

    private androidx.media3.datasource.iobyxmoadg zdlpuopuiu() {
        if (this.f10014wkgbmnqykc == null) {
            FileDataSource fileDataSource = new FileDataSource();
            this.f10014wkgbmnqykc = fileDataSource;
            rgvfuqvkyq(fileDataSource);
        }
        return this.f10014wkgbmnqykc;
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public Uri agtfadlqog() {
        androidx.media3.datasource.iobyxmoadg iobyxmoadgVar = this.f10008gtknphoqwx;
        if (iobyxmoadgVar == null) {
            return null;
        }
        return iobyxmoadgVar.agtfadlqog();
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public void close() {
        androidx.media3.datasource.iobyxmoadg iobyxmoadgVar = this.f10008gtknphoqwx;
        if (iobyxmoadgVar != null) {
            try {
                iobyxmoadgVar.close();
            } finally {
                this.f10008gtknphoqwx = null;
            }
        }
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public void eablkybsjg(wflxmlrfwp wflxmlrfwpVar) {
        y2.iobyxmoadg.eablkybsjg(wflxmlrfwpVar);
        this.f10013ppxfxbqfkf.eablkybsjg(wflxmlrfwpVar);
        this.f10015zoijcleaow.add(wflxmlrfwpVar);
        cqumvgiudr(this.f10014wkgbmnqykc, wflxmlrfwpVar);
        cqumvgiudr(this.f10007eablkybsjg, wflxmlrfwpVar);
        cqumvgiudr(this.f10009gxszxtbevo, wflxmlrfwpVar);
        cqumvgiudr(this.f10011lqeggnwhkg, wflxmlrfwpVar);
        cqumvgiudr(this.f10012nufgyqmvbu, wflxmlrfwpVar);
        cqumvgiudr(this.f10006dxjokdxxww, wflxmlrfwpVar);
        cqumvgiudr(this.f10005btonecajqb, wflxmlrfwpVar);
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public long iobyxmoadg(lqeggnwhkg lqeggnwhkgVar) {
        y2.iobyxmoadg.lqeggnwhkg(this.f10008gtknphoqwx == null);
        String scheme = lqeggnwhkgVar.f15057iobyxmoadg.getScheme();
        if (stevsuqkhv.wizcaqwiak(lqeggnwhkgVar.f15057iobyxmoadg)) {
            String path = lqeggnwhkgVar.f15057iobyxmoadg.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f10008gtknphoqwx = zdlpuopuiu();
            } else {
                this.f10008gtknphoqwx = vdvldrhtss();
            }
        } else if ("asset".equals(scheme)) {
            this.f10008gtknphoqwx = vdvldrhtss();
        } else if ("content".equals(scheme)) {
            this.f10008gtknphoqwx = oxmwwwfdhm();
        } else if ("rtmp".equals(scheme)) {
            this.f10008gtknphoqwx = jyumaefscl();
        } else if ("udp".equals(scheme)) {
            this.f10008gtknphoqwx = iwizpuwonk();
        } else if ("data".equals(scheme)) {
            this.f10008gtknphoqwx = kcexrzcfyt();
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            this.f10008gtknphoqwx = yggfygwlhe();
        } else {
            this.f10008gtknphoqwx = this.f10013ppxfxbqfkf;
        }
        return this.f10008gtknphoqwx.iobyxmoadg(lqeggnwhkgVar);
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public Map wkgbmnqykc() {
        androidx.media3.datasource.iobyxmoadg iobyxmoadgVar = this.f10008gtknphoqwx;
        return iobyxmoadgVar == null ? Collections.emptyMap() : iobyxmoadgVar.wkgbmnqykc();
    }

    @Override // v2.btonecajqb
    public int zoijcleaow(byte[] bArr, int i13, int i14) {
        return ((androidx.media3.datasource.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(this.f10008gtknphoqwx)).zoijcleaow(bArr, i13, i14);
    }
}
