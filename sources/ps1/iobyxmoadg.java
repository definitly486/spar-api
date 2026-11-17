package ps1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements gz0.iobyxmoadg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final String f77276cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final String f77277esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final InterfaceC1713iobyxmoadg f77278iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f77279jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f77280yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f77281zdlpuopuiu;

    /* JADX INFO: renamed from: ps1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public interface InterfaceC1713iobyxmoadg {

        /* JADX INFO: renamed from: ps1.iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1714iobyxmoadg implements InterfaceC1713iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final int f77282iobyxmoadg;

            public C1714iobyxmoadg(int i13) {
                this.f77282iobyxmoadg = i13;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1714iobyxmoadg) && this.f77282iobyxmoadg == ((C1714iobyxmoadg) obj).f77282iobyxmoadg;
            }

            public int hashCode() {
                return Integer.hashCode(this.f77282iobyxmoadg);
            }

            public final int iobyxmoadg() {
                return this.f77282iobyxmoadg;
            }

            public String toString() {
                return "Error(messageRes=" + this.f77282iobyxmoadg + ")";
            }
        }

        /* JADX INFO: renamed from: ps1.iobyxmoadg$iobyxmoadg$zoijcleaow */
        public static final class zoijcleaow implements InterfaceC1713iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f77283iobyxmoadg;

            public zoijcleaow(String balanceText) {
                zdlpuopuiu.btonecajqb(balanceText, "balanceText");
                this.f77283iobyxmoadg = balanceText;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f77283iobyxmoadg, ((zoijcleaow) obj).f77283iobyxmoadg);
            }

            public int hashCode() {
                return this.f77283iobyxmoadg.hashCode();
            }

            public final String iobyxmoadg() {
                return this.f77283iobyxmoadg;
            }

            public String toString() {
                return "Success(balanceText=" + this.f77283iobyxmoadg + ")";
            }
        }
    }

    public iobyxmoadg(String itemId, String imagePromoUrl, String imageStickerUrl, InterfaceC1713iobyxmoadg balanceType, String shortDescription, String dateExpiration) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(imagePromoUrl, "imagePromoUrl");
        zdlpuopuiu.btonecajqb(imageStickerUrl, "imageStickerUrl");
        zdlpuopuiu.btonecajqb(balanceType, "balanceType");
        zdlpuopuiu.btonecajqb(shortDescription, "shortDescription");
        zdlpuopuiu.btonecajqb(dateExpiration, "dateExpiration");
        this.f77281zdlpuopuiu = itemId;
        this.f77280yggfygwlhe = imagePromoUrl;
        this.f77279jyumaefscl = imageStickerUrl;
        this.f77278iwizpuwonk = balanceType;
        this.f77276cqumvgiudr = shortDescription;
        this.f77277esjtqupxsv = dateExpiration;
    }

    public final String eablkybsjg() {
        return this.f77280yggfygwlhe;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f77281zdlpuopuiu, iobyxmoadgVar.f77281zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f77280yggfygwlhe, iobyxmoadgVar.f77280yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f77279jyumaefscl, iobyxmoadgVar.f77279jyumaefscl) && zdlpuopuiu.eablkybsjg(this.f77278iwizpuwonk, iobyxmoadgVar.f77278iwizpuwonk) && zdlpuopuiu.eablkybsjg(this.f77276cqumvgiudr, iobyxmoadgVar.f77276cqumvgiudr) && zdlpuopuiu.eablkybsjg(this.f77277esjtqupxsv, iobyxmoadgVar.f77277esjtqupxsv);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f77281zdlpuopuiu;
    }

    public int hashCode() {
        return (((((((((this.f77281zdlpuopuiu.hashCode() * 31) + this.f77280yggfygwlhe.hashCode()) * 31) + this.f77279jyumaefscl.hashCode()) * 31) + this.f77278iwizpuwonk.hashCode()) * 31) + this.f77276cqumvgiudr.hashCode()) * 31) + this.f77277esjtqupxsv.hashCode();
    }

    public final InterfaceC1713iobyxmoadg iobyxmoadg() {
        return this.f77278iwizpuwonk;
    }

    public final String lqeggnwhkg() {
        return this.f77279jyumaefscl;
    }

    public final String nufgyqmvbu() {
        return this.f77276cqumvgiudr;
    }

    public String toString() {
        return "SpecialBannerPromoBonusesUiModel(itemId=" + this.f77281zdlpuopuiu + ", imagePromoUrl=" + this.f77280yggfygwlhe + ", imageStickerUrl=" + this.f77279jyumaefscl + ", balanceType=" + this.f77278iwizpuwonk + ", shortDescription=" + this.f77276cqumvgiudr + ", dateExpiration=" + this.f77277esjtqupxsv + ")";
    }

    public final String wkgbmnqykc() {
        return this.f77277esjtqupxsv;
    }
}
