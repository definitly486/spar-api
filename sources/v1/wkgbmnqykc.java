package v1;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gxszxtbevo f115224iobyxmoadg;

    private static final class eablkybsjg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ContentInfo f115225iobyxmoadg;

        eablkybsjg(ContentInfo contentInfo) {
            this.f115225iobyxmoadg = v1.ppxfxbqfkf.iobyxmoadg(u1.nufgyqmvbu.gxszxtbevo(contentInfo));
        }

        @Override // v1.wkgbmnqykc.gxszxtbevo
        public ContentInfo iobyxmoadg() {
            return this.f115225iobyxmoadg;
        }

        @Override // v1.wkgbmnqykc.gxszxtbevo
        public int lqeggnwhkg() {
            return this.f115225iobyxmoadg.getSource();
        }

        @Override // v1.wkgbmnqykc.gxszxtbevo
        public int ppxfxbqfkf() {
            return this.f115225iobyxmoadg.getFlags();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f115225iobyxmoadg + "}";
        }

        @Override // v1.wkgbmnqykc.gxszxtbevo
        public ClipData zoijcleaow() {
            return this.f115225iobyxmoadg.getClip();
        }
    }

    private interface gxszxtbevo {
        ContentInfo iobyxmoadg();

        int lqeggnwhkg();

        int ppxfxbqfkf();

        ClipData zoijcleaow();
    }

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ppxfxbqfkf f115226iobyxmoadg;

        public iobyxmoadg(ClipData clipData, int i13) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f115226iobyxmoadg = new zoijcleaow(clipData, i13);
            } else {
                this.f115226iobyxmoadg = new C2870wkgbmnqykc(clipData, i13);
            }
        }

        public wkgbmnqykc iobyxmoadg() {
            return this.f115226iobyxmoadg.build();
        }

        public iobyxmoadg ppxfxbqfkf(int i13) {
            this.f115226iobyxmoadg.zoijcleaow(i13);
            return this;
        }

        public iobyxmoadg wkgbmnqykc(Uri uri) {
            this.f115226iobyxmoadg.iobyxmoadg(uri);
            return this;
        }

        public iobyxmoadg zoijcleaow(Bundle bundle) {
            this.f115226iobyxmoadg.setExtras(bundle);
            return this;
        }
    }

    private static final class lqeggnwhkg implements gxszxtbevo {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final Bundle f115227eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ClipData f115228iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int f115229ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final Uri f115230wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f115231zoijcleaow;

        lqeggnwhkg(C2870wkgbmnqykc c2870wkgbmnqykc) {
            this.f115228iobyxmoadg = (ClipData) u1.nufgyqmvbu.gxszxtbevo(c2870wkgbmnqykc.f115233iobyxmoadg);
            this.f115231zoijcleaow = u1.nufgyqmvbu.ppxfxbqfkf(c2870wkgbmnqykc.f115236zoijcleaow, 0, 5, AdRevenueConstants.SOURCE_KEY);
            this.f115229ppxfxbqfkf = u1.nufgyqmvbu.eablkybsjg(c2870wkgbmnqykc.f115234ppxfxbqfkf, 1);
            this.f115230wkgbmnqykc = c2870wkgbmnqykc.f115235wkgbmnqykc;
            this.f115227eablkybsjg = c2870wkgbmnqykc.f115232eablkybsjg;
        }

        @Override // v1.wkgbmnqykc.gxszxtbevo
        public ContentInfo iobyxmoadg() {
            return null;
        }

        @Override // v1.wkgbmnqykc.gxszxtbevo
        public int lqeggnwhkg() {
            return this.f115231zoijcleaow;
        }

        @Override // v1.wkgbmnqykc.gxszxtbevo
        public int ppxfxbqfkf() {
            return this.f115229ppxfxbqfkf;
        }

        public String toString() {
            String str;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("ContentInfoCompat{clip=");
            sb3.append(this.f115228iobyxmoadg.getDescription());
            sb3.append(", source=");
            sb3.append(wkgbmnqykc.eablkybsjg(this.f115231zoijcleaow));
            sb3.append(", flags=");
            sb3.append(wkgbmnqykc.iobyxmoadg(this.f115229ppxfxbqfkf));
            if (this.f115230wkgbmnqykc == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f115230wkgbmnqykc.toString().length() + ")";
            }
            sb3.append(str);
            sb3.append(this.f115227eablkybsjg != null ? ", hasExtras" : "");
            sb3.append("}");
            return sb3.toString();
        }

        @Override // v1.wkgbmnqykc.gxszxtbevo
        public ClipData zoijcleaow() {
            return this.f115228iobyxmoadg;
        }
    }

    private interface ppxfxbqfkf {
        wkgbmnqykc build();

        void iobyxmoadg(Uri uri);

        void setExtras(Bundle bundle);

        void zoijcleaow(int i13);
    }

    /* JADX INFO: renamed from: v1.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    private static final class C2870wkgbmnqykc implements ppxfxbqfkf {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        Bundle f115232eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        ClipData f115233iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        int f115234ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        Uri f115235wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        int f115236zoijcleaow;

        C2870wkgbmnqykc(ClipData clipData, int i13) {
            this.f115233iobyxmoadg = clipData;
            this.f115236zoijcleaow = i13;
        }

        @Override // v1.wkgbmnqykc.ppxfxbqfkf
        public wkgbmnqykc build() {
            return new wkgbmnqykc(new lqeggnwhkg(this));
        }

        @Override // v1.wkgbmnqykc.ppxfxbqfkf
        public void iobyxmoadg(Uri uri) {
            this.f115235wkgbmnqykc = uri;
        }

        @Override // v1.wkgbmnqykc.ppxfxbqfkf
        public void setExtras(Bundle bundle) {
            this.f115232eablkybsjg = bundle;
        }

        @Override // v1.wkgbmnqykc.ppxfxbqfkf
        public void zoijcleaow(int i13) {
            this.f115234ppxfxbqfkf = i13;
        }
    }

    private static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ContentInfo.Builder f115237iobyxmoadg;

        zoijcleaow(ClipData clipData, int i13) {
            this.f115237iobyxmoadg = dxjokdxxww.iobyxmoadg(clipData, i13);
        }

        @Override // v1.wkgbmnqykc.ppxfxbqfkf
        public wkgbmnqykc build() {
            return new wkgbmnqykc(new eablkybsjg(this.f115237iobyxmoadg.build()));
        }

        @Override // v1.wkgbmnqykc.ppxfxbqfkf
        public void iobyxmoadg(Uri uri) {
            this.f115237iobyxmoadg.setLinkUri(uri);
        }

        @Override // v1.wkgbmnqykc.ppxfxbqfkf
        public void setExtras(Bundle bundle) {
            this.f115237iobyxmoadg.setExtras(bundle);
        }

        @Override // v1.wkgbmnqykc.ppxfxbqfkf
        public void zoijcleaow(int i13) {
            this.f115237iobyxmoadg.setFlags(i13);
        }
    }

    wkgbmnqykc(gxszxtbevo gxszxtbevoVar) {
        this.f115224iobyxmoadg = gxszxtbevoVar;
    }

    static String eablkybsjg(int i13) {
        if (i13 == 0) {
            return "SOURCE_APP";
        }
        if (i13 == 1) {
            return "SOURCE_CLIPBOARD";
        }
        if (i13 == 2) {
            return "SOURCE_INPUT_METHOD";
        }
        if (i13 == 3) {
            return "SOURCE_DRAG_AND_DROP";
        }
        if (i13 != 4) {
            return i13 != 5 ? String.valueOf(i13) : "SOURCE_PROCESS_TEXT";
        }
        return "SOURCE_AUTOFILL";
    }

    static String iobyxmoadg(int i13) {
        return (i13 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i13);
    }

    public static wkgbmnqykc lqeggnwhkg(ContentInfo contentInfo) {
        return new wkgbmnqykc(new eablkybsjg(contentInfo));
    }

    public ContentInfo gxszxtbevo() {
        ContentInfo contentInfoIobyxmoadg = this.f115224iobyxmoadg.iobyxmoadg();
        Objects.requireNonNull(contentInfoIobyxmoadg);
        return v1.ppxfxbqfkf.iobyxmoadg(contentInfoIobyxmoadg);
    }

    public int ppxfxbqfkf() {
        return this.f115224iobyxmoadg.ppxfxbqfkf();
    }

    public String toString() {
        return this.f115224iobyxmoadg.toString();
    }

    public int wkgbmnqykc() {
        return this.f115224iobyxmoadg.lqeggnwhkg();
    }

    public ClipData zoijcleaow() {
        return this.f115224iobyxmoadg.zoijcleaow();
    }
}
