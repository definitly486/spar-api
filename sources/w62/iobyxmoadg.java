package w62;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements o00.iobyxmoadg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final String f118897cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final String f118898esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final InterfaceC2957iobyxmoadg f118899iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f118900jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f118901yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f118902zdlpuopuiu;

    /* JADX INFO: renamed from: w62.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public interface InterfaceC2957iobyxmoadg {

        /* JADX INFO: renamed from: w62.iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2958iobyxmoadg implements InterfaceC2957iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final int f118903iobyxmoadg;

            public C2958iobyxmoadg(int i13) {
                this.f118903iobyxmoadg = i13;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2958iobyxmoadg) && this.f118903iobyxmoadg == ((C2958iobyxmoadg) obj).f118903iobyxmoadg;
            }

            public int hashCode() {
                return Integer.hashCode(this.f118903iobyxmoadg);
            }

            public final int iobyxmoadg() {
                return this.f118903iobyxmoadg;
            }

            public String toString() {
                return "Error(messageRes=" + this.f118903iobyxmoadg + ")";
            }
        }

        /* JADX INFO: renamed from: w62.iobyxmoadg$iobyxmoadg$zoijcleaow */
        public static final class zoijcleaow implements InterfaceC2957iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f118904iobyxmoadg;

            public zoijcleaow(String balanceText) {
                zdlpuopuiu.btonecajqb(balanceText, "balanceText");
                this.f118904iobyxmoadg = balanceText;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f118904iobyxmoadg, ((zoijcleaow) obj).f118904iobyxmoadg);
            }

            public int hashCode() {
                return this.f118904iobyxmoadg.hashCode();
            }

            public final String iobyxmoadg() {
                return this.f118904iobyxmoadg;
            }

            public String toString() {
                return "Success(balanceText=" + this.f118904iobyxmoadg + ")";
            }
        }
    }

    public iobyxmoadg(String itemId, String imagePromoUrl, String imageStickerUrl, InterfaceC2957iobyxmoadg balanceType, String shortDescription, String dateExpiration) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(imagePromoUrl, "imagePromoUrl");
        zdlpuopuiu.btonecajqb(imageStickerUrl, "imageStickerUrl");
        zdlpuopuiu.btonecajqb(balanceType, "balanceType");
        zdlpuopuiu.btonecajqb(shortDescription, "shortDescription");
        zdlpuopuiu.btonecajqb(dateExpiration, "dateExpiration");
        this.f118902zdlpuopuiu = itemId;
        this.f118901yggfygwlhe = imagePromoUrl;
        this.f118900jyumaefscl = imageStickerUrl;
        this.f118899iwizpuwonk = balanceType;
        this.f118897cqumvgiudr = shortDescription;
        this.f118898esjtqupxsv = dateExpiration;
    }

    public final String eablkybsjg() {
        return this.f118901yggfygwlhe;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f118902zdlpuopuiu, iobyxmoadgVar.f118902zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f118901yggfygwlhe, iobyxmoadgVar.f118901yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f118900jyumaefscl, iobyxmoadgVar.f118900jyumaefscl) && zdlpuopuiu.eablkybsjg(this.f118899iwizpuwonk, iobyxmoadgVar.f118899iwizpuwonk) && zdlpuopuiu.eablkybsjg(this.f118897cqumvgiudr, iobyxmoadgVar.f118897cqumvgiudr) && zdlpuopuiu.eablkybsjg(this.f118898esjtqupxsv, iobyxmoadgVar.f118898esjtqupxsv);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f118902zdlpuopuiu;
    }

    public int hashCode() {
        return (((((((((this.f118902zdlpuopuiu.hashCode() * 31) + this.f118901yggfygwlhe.hashCode()) * 31) + this.f118900jyumaefscl.hashCode()) * 31) + this.f118899iwizpuwonk.hashCode()) * 31) + this.f118897cqumvgiudr.hashCode()) * 31) + this.f118898esjtqupxsv.hashCode();
    }

    public final InterfaceC2957iobyxmoadg iobyxmoadg() {
        return this.f118899iwizpuwonk;
    }

    public final String lqeggnwhkg() {
        return this.f118900jyumaefscl;
    }

    public final String nufgyqmvbu() {
        return this.f118897cqumvgiudr;
    }

    public String toString() {
        return "SpecialBannerPromoBonusesUiModel(itemId=" + this.f118902zdlpuopuiu + ", imagePromoUrl=" + this.f118901yggfygwlhe + ", imageStickerUrl=" + this.f118900jyumaefscl + ", balanceType=" + this.f118899iwizpuwonk + ", shortDescription=" + this.f118897cqumvgiudr + ", dateExpiration=" + this.f118898esjtqupxsv + ")";
    }

    public final String wkgbmnqykc() {
        return this.f118898esjtqupxsv;
    }
}
