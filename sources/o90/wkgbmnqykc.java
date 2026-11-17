package o90;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.ColorsUiModel;
import ru.myspar.evropolis.api.model.EvropolisGift;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc implements o00.iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final iobyxmoadg f72352cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final String f72353cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final o90.iobyxmoadg f72354esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final boolean f72355istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f72356iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f72357jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final String f72358lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final String f72359pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private EvropolisGift f72360yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final ColorsUiModel f72361yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f72362zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final List f72363zynmafqrjb;

    public static abstract class iobyxmoadg {

        /* JADX INFO: renamed from: o90.wkgbmnqykc$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1565iobyxmoadg extends iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final C1565iobyxmoadg f72364iobyxmoadg = new C1565iobyxmoadg();

            private C1565iobyxmoadg() {
                super(null);
            }
        }

        public static final class ppxfxbqfkf extends iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private boolean f72365iobyxmoadg;

            public ppxfxbqfkf(boolean z13) {
                super(null);
                this.f72365iobyxmoadg = z13;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ppxfxbqfkf) && this.f72365iobyxmoadg == ((ppxfxbqfkf) obj).f72365iobyxmoadg;
            }

            public int hashCode() {
                return Boolean.hashCode(this.f72365iobyxmoadg);
            }

            public final void ppxfxbqfkf(boolean z13) {
                this.f72365iobyxmoadg = z13;
            }

            public String toString() {
                return "ScratchAnim(isFinished=" + this.f72365iobyxmoadg + ")";
            }

            public final boolean zoijcleaow() {
                return this.f72365iobyxmoadg;
            }
        }

        public static final class zoijcleaow extends iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final zoijcleaow f72366iobyxmoadg = new zoijcleaow();

            private zoijcleaow() {
                super(null);
            }
        }

        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final boolean iobyxmoadg() {
            ppxfxbqfkf ppxfxbqfkfVar = this instanceof ppxfxbqfkf ? (ppxfxbqfkf) this : null;
            if (ppxfxbqfkfVar != null) {
                return ppxfxbqfkfVar.zoijcleaow();
            }
            return false;
        }

        private iobyxmoadg() {
        }
    }

    public wkgbmnqykc(String itemId, ColorsUiModel colorsUiModel, String title, String subtitle, String image, o90.iobyxmoadg iobyxmoadgVar, String stickerTitle, String str, List stickers, boolean z13, iobyxmoadg animationState) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(subtitle, "subtitle");
        zdlpuopuiu.btonecajqb(image, "image");
        zdlpuopuiu.btonecajqb(stickerTitle, "stickerTitle");
        zdlpuopuiu.btonecajqb(stickers, "stickers");
        zdlpuopuiu.btonecajqb(animationState, "animationState");
        this.f72362zdlpuopuiu = itemId;
        this.f72361yggfygwlhe = colorsUiModel;
        this.f72357jyumaefscl = title;
        this.f72356iwizpuwonk = subtitle;
        this.f72353cqumvgiudr = image;
        this.f72354esjtqupxsv = iobyxmoadgVar;
        this.f72358lereixgezr = stickerTitle;
        this.f72359pmvmpeiblj = str;
        this.f72363zynmafqrjb = stickers;
        this.f72355istkbnxepw = z13;
        this.f72352cdpycssgdh = animationState;
    }

    public final String btonecajqb() {
        return this.f72353cqumvgiudr;
    }

    public final String draadjrbmk() {
        return this.f72359pmvmpeiblj;
    }

    public final EvropolisGift dxjokdxxww() {
        return this.f72360yadqdtsiqt;
    }

    public final iobyxmoadg eablkybsjg() {
        return this.f72352cdpycssgdh;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return zdlpuopuiu.eablkybsjg(this.f72362zdlpuopuiu, wkgbmnqykcVar.f72362zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f72361yggfygwlhe, wkgbmnqykcVar.f72361yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f72357jyumaefscl, wkgbmnqykcVar.f72357jyumaefscl) && zdlpuopuiu.eablkybsjg(this.f72356iwizpuwonk, wkgbmnqykcVar.f72356iwizpuwonk) && zdlpuopuiu.eablkybsjg(this.f72353cqumvgiudr, wkgbmnqykcVar.f72353cqumvgiudr) && zdlpuopuiu.eablkybsjg(this.f72354esjtqupxsv, wkgbmnqykcVar.f72354esjtqupxsv) && zdlpuopuiu.eablkybsjg(this.f72358lereixgezr, wkgbmnqykcVar.f72358lereixgezr) && zdlpuopuiu.eablkybsjg(this.f72359pmvmpeiblj, wkgbmnqykcVar.f72359pmvmpeiblj) && zdlpuopuiu.eablkybsjg(this.f72363zynmafqrjb, wkgbmnqykcVar.f72363zynmafqrjb) && this.f72355istkbnxepw == wkgbmnqykcVar.f72355istkbnxepw && zdlpuopuiu.eablkybsjg(this.f72352cdpycssgdh, wkgbmnqykcVar.f72352cdpycssgdh);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f72362zdlpuopuiu;
    }

    public final String gtknphoqwx() {
        return this.f72358lereixgezr;
    }

    public int hashCode() {
        int iHashCode = this.f72362zdlpuopuiu.hashCode() * 31;
        ColorsUiModel colorsUiModel = this.f72361yggfygwlhe;
        int iHashCode2 = (((((((iHashCode + (colorsUiModel == null ? 0 : colorsUiModel.hashCode())) * 31) + this.f72357jyumaefscl.hashCode()) * 31) + this.f72356iwizpuwonk.hashCode()) * 31) + this.f72353cqumvgiudr.hashCode()) * 31;
        o90.iobyxmoadg iobyxmoadgVar = this.f72354esjtqupxsv;
        int iHashCode3 = (((iHashCode2 + (iobyxmoadgVar == null ? 0 : iobyxmoadgVar.hashCode())) * 31) + this.f72358lereixgezr.hashCode()) * 31;
        String str = this.f72359pmvmpeiblj;
        return ((((((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.f72363zynmafqrjb.hashCode()) * 31) + Boolean.hashCode(this.f72355istkbnxepw)) * 31) + this.f72352cdpycssgdh.hashCode();
    }

    public final wkgbmnqykc iobyxmoadg(String itemId, ColorsUiModel colorsUiModel, String title, String subtitle, String image, o90.iobyxmoadg iobyxmoadgVar, String stickerTitle, String str, List stickers, boolean z13, iobyxmoadg animationState) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(subtitle, "subtitle");
        zdlpuopuiu.btonecajqb(image, "image");
        zdlpuopuiu.btonecajqb(stickerTitle, "stickerTitle");
        zdlpuopuiu.btonecajqb(stickers, "stickers");
        zdlpuopuiu.btonecajqb(animationState, "animationState");
        return new wkgbmnqykc(itemId, colorsUiModel, title, subtitle, image, iobyxmoadgVar, stickerTitle, str, stickers, z13, animationState);
    }

    public final o90.iobyxmoadg lqeggnwhkg() {
        return this.f72354esjtqupxsv;
    }

    public final ColorsUiModel nufgyqmvbu() {
        return this.f72361yggfygwlhe;
    }

    public final String ojitshcjhn() {
        return this.f72356iwizpuwonk;
    }

    public final void oxmwwwfdhm(EvropolisGift evropolisGift) {
        this.f72360yadqdtsiqt = evropolisGift;
    }

    public final String rgvfuqvkyq() {
        return this.f72357jyumaefscl;
    }

    public String toString() {
        return "EvropolisStickersCardUIModel(itemId=" + this.f72362zdlpuopuiu + ", colorsUiModel=" + this.f72361yggfygwlhe + ", title=" + this.f72357jyumaefscl + ", subtitle=" + this.f72356iwizpuwonk + ", image=" + this.f72353cqumvgiudr + ", button=" + this.f72354esjtqupxsv + ", stickerTitle=" + this.f72358lereixgezr + ", stickerValue=" + this.f72359pmvmpeiblj + ", stickers=" + this.f72363zynmafqrjb + ", isStickerVisible=" + this.f72355istkbnxepw + ", animationState=" + this.f72352cdpycssgdh + ")";
    }

    public final boolean vdvldrhtss() {
        return this.f72355istkbnxepw;
    }

    public final List wflxmlrfwp() {
        return this.f72363zynmafqrjb;
    }

    public /* synthetic */ wkgbmnqykc(String str, ColorsUiModel colorsUiModel, String str2, String str3, String str4, o90.iobyxmoadg iobyxmoadgVar, String str5, String str6, List list, boolean z13, iobyxmoadg iobyxmoadgVar2, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, colorsUiModel, str2, str3, str4, iobyxmoadgVar, str5, str6, list, z13, (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadg.C1565iobyxmoadg.f72364iobyxmoadg : iobyxmoadgVar2);
    }
}
