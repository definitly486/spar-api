package ru.myspar.core.domain.models.reviewWithBonuses;

import android.os.Parcel;
import android.os.Parcelable;
import bk.wflxmlrfwp;
import bk.zoijcleaow;
import dk.gxszxtbevo;
import ek.eablkybsjg;
import ek.wkgbmnqykc;
import fk.dvvnrvtcbc;
import fk.hcddaimhww;
import fk.iozdgvuglv;
import fk.iyctptxqzt;
import fk.ntlheqmsrt;
import fk.sflfametgt;
import fk.wizcaqwiak;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes4.dex */
@wflxmlrfwp
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u00025AB;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rBS\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010 J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b;\u00101\u001a\u0004\b<\u0010\"R\u0011\u0010?\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006B"}, d2 = {"Lru/myspar/core/domain/models/reviewWithBonuses/ReviewWithBonuses;", "Landroid/os/Parcelable;", "", "id", "Lru/myspar/core/domain/models/reviewWithBonuses/ReviewWithBonusesItem;", "reviewItem", "", "place", "bonusQuantity", "", "delayMs", "placeholder", "<init>", "(ILru/myspar/core/domain/models/reviewWithBonuses/ReviewWithBonusesItem;Ljava/lang/String;Ljava/lang/Integer;JLjava/lang/String;)V", "seen0", "Lfk/dvvnrvtcbc;", "serializationConstructorMarker", "(IILru/myspar/core/domain/models/reviewWithBonuses/ReviewWithBonusesItem;Ljava/lang/String;Ljava/lang/Integer;JLjava/lang/String;Lfk/dvvnrvtcbc;)V", "self", "Lek/wkgbmnqykc;", "output", "Ldk/gxszxtbevo;", "serialDesc", "Lgg/wwaezpbzkn;", "nufgyqmvbu", "(Lru/myspar/core/domain/models/reviewWithBonuses/ReviewWithBonuses;Lek/wkgbmnqykc;Ldk/gxszxtbevo;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "I", "getId", "yggfygwlhe", "Lru/myspar/core/domain/models/reviewWithBonuses/ReviewWithBonusesItem;", "gxszxtbevo", "()Lru/myspar/core/domain/models/reviewWithBonuses/ReviewWithBonusesItem;", "jyumaefscl", "Ljava/lang/String;", "getPlace", "iwizpuwonk", "Ljava/lang/Integer;", "zoijcleaow", "()Ljava/lang/Integer;", "cqumvgiudr", "J", "ppxfxbqfkf", "()J", "esjtqupxsv", "eablkybsjg", "lqeggnwhkg", "()Z", "isMainScreen", "Companion", "iobyxmoadg", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ReviewWithBonuses implements Parcelable {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final long delayMs;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final String placeholder;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer bonusQuantity;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String place;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final ReviewWithBonusesItem reviewItem;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final int id;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ReviewWithBonuses> CREATOR = new ppxfxbqfkf();

    public /* synthetic */ class iobyxmoadg implements iozdgvuglv {
        private static final gxszxtbevo descriptor;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f87426iobyxmoadg;

        static {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
            f87426iobyxmoadg = iobyxmoadgVar;
            iyctptxqzt iyctptxqztVar = new iyctptxqzt("ru.myspar.core.domain.models.reviewWithBonuses.ReviewWithBonuses", iobyxmoadgVar, 6);
            iyctptxqztVar.ojitshcjhn("id", true);
            iyctptxqztVar.ojitshcjhn("reviewItem", false);
            iyctptxqztVar.ojitshcjhn("place", false);
            iyctptxqztVar.ojitshcjhn("bonusQuantity", false);
            iyctptxqztVar.ojitshcjhn("delayMs", false);
            iyctptxqztVar.ojitshcjhn("placeholder", false);
            descriptor = iyctptxqztVar;
        }

        private iobyxmoadg() {
        }

        @Override // fk.iozdgvuglv
        public final zoijcleaow[] eablkybsjg() {
            hcddaimhww hcddaimhwwVar = hcddaimhww.f34142iobyxmoadg;
            zoijcleaow zoijcleaowVarYggfygwlhe = ck.iobyxmoadg.yggfygwlhe(hcddaimhwwVar);
            wizcaqwiak wizcaqwiakVar = wizcaqwiak.f34245iobyxmoadg;
            return new zoijcleaow[]{hcddaimhwwVar, ReviewWithBonusesItem.iobyxmoadg.f87430iobyxmoadg, wizcaqwiakVar, zoijcleaowVarYggfygwlhe, ntlheqmsrt.f34209iobyxmoadg, wizcaqwiakVar};
        }

        @Override // bk.iobyxmoadg
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public final ReviewWithBonuses zoijcleaow(eablkybsjg decoder) {
            int i13;
            int i14;
            long j13;
            ReviewWithBonusesItem reviewWithBonusesItem;
            String str;
            Integer num;
            String strVdvldrhtss;
            zdlpuopuiu.btonecajqb(decoder, "decoder");
            gxszxtbevo gxszxtbevoVar = descriptor;
            ek.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = decoder.ppxfxbqfkf(gxszxtbevoVar);
            if (ppxfxbqfkfVarPpxfxbqfkf.kcexrzcfyt()) {
                int iDxjokdxxww = ppxfxbqfkfVarPpxfxbqfkf.dxjokdxxww(gxszxtbevoVar, 0);
                ReviewWithBonusesItem reviewWithBonusesItem2 = (ReviewWithBonusesItem) ppxfxbqfkfVarPpxfxbqfkf.lereixgezr(gxszxtbevoVar, 1, ReviewWithBonusesItem.iobyxmoadg.f87430iobyxmoadg, null);
                String strVdvldrhtss2 = ppxfxbqfkfVarPpxfxbqfkf.vdvldrhtss(gxszxtbevoVar, 2);
                Integer num2 = (Integer) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 3, hcddaimhww.f34142iobyxmoadg, null);
                long jWwaezpbzkn = ppxfxbqfkfVarPpxfxbqfkf.wwaezpbzkn(gxszxtbevoVar, 4);
                i13 = iDxjokdxxww;
                strVdvldrhtss = ppxfxbqfkfVarPpxfxbqfkf.vdvldrhtss(gxszxtbevoVar, 5);
                num = num2;
                i14 = 63;
                str = strVdvldrhtss2;
                reviewWithBonusesItem = reviewWithBonusesItem2;
                j13 = jWwaezpbzkn;
            } else {
                long jWwaezpbzkn2 = 0;
                boolean z13 = true;
                int iDxjokdxxww2 = 0;
                ReviewWithBonusesItem reviewWithBonusesItem3 = null;
                String strVdvldrhtss3 = null;
                Integer num3 = null;
                String strVdvldrhtss4 = null;
                int i15 = 0;
                while (z13) {
                    int iYadqdtsiqt = ppxfxbqfkfVarPpxfxbqfkf.yadqdtsiqt(gxszxtbevoVar);
                    switch (iYadqdtsiqt) {
                        case -1:
                            z13 = false;
                            continue;
                        case 0:
                            iDxjokdxxww2 = ppxfxbqfkfVarPpxfxbqfkf.dxjokdxxww(gxszxtbevoVar, 0);
                            i15 |= 1;
                            continue;
                        case 1:
                            reviewWithBonusesItem3 = (ReviewWithBonusesItem) ppxfxbqfkfVarPpxfxbqfkf.lereixgezr(gxszxtbevoVar, 1, ReviewWithBonusesItem.iobyxmoadg.f87430iobyxmoadg, reviewWithBonusesItem3);
                            i15 |= 2;
                            break;
                        case 2:
                            strVdvldrhtss3 = ppxfxbqfkfVarPpxfxbqfkf.vdvldrhtss(gxszxtbevoVar, 2);
                            i15 |= 4;
                            break;
                        case 3:
                            num3 = (Integer) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 3, hcddaimhww.f34142iobyxmoadg, num3);
                            i15 |= 8;
                            break;
                        case 4:
                            jWwaezpbzkn2 = ppxfxbqfkfVarPpxfxbqfkf.wwaezpbzkn(gxszxtbevoVar, 4);
                            i15 |= 16;
                            break;
                        case 5:
                            strVdvldrhtss4 = ppxfxbqfkfVarPpxfxbqfkf.vdvldrhtss(gxszxtbevoVar, 5);
                            i15 |= 32;
                            break;
                        default:
                            throw new UnknownFieldException(iYadqdtsiqt);
                    }
                }
                i13 = iDxjokdxxww2;
                i14 = i15;
                j13 = jWwaezpbzkn2;
                reviewWithBonusesItem = reviewWithBonusesItem3;
                str = strVdvldrhtss3;
                num = num3;
                strVdvldrhtss = strVdvldrhtss4;
            }
            ppxfxbqfkfVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVar);
            return new ReviewWithBonuses(i14, i13, reviewWithBonusesItem, str, num, j13, strVdvldrhtss, (dvvnrvtcbc) null);
        }

        @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
        public final gxszxtbevo iobyxmoadg() {
            return descriptor;
        }

        @Override // bk.agtfadlqog
        /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
        public final void wkgbmnqykc(ek.gxszxtbevo encoder, ReviewWithBonuses value) {
            zdlpuopuiu.btonecajqb(encoder, "encoder");
            zdlpuopuiu.btonecajqb(value, "value");
            gxszxtbevo gxszxtbevoVar = descriptor;
            wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = encoder.ppxfxbqfkf(gxszxtbevoVar);
            ReviewWithBonuses.nufgyqmvbu(value, wkgbmnqykcVarPpxfxbqfkf, gxszxtbevoVar);
            wkgbmnqykcVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVar);
        }

        @Override // fk.iozdgvuglv
        public zoijcleaow[] ppxfxbqfkf() {
            return iozdgvuglv.iobyxmoadg.iobyxmoadg(this);
        }
    }

    public static final class ppxfxbqfkf implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ReviewWithBonuses createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new ReviewWithBonuses(parcel.readInt(), ReviewWithBonusesItem.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final ReviewWithBonuses[] newArray(int i13) {
            return new ReviewWithBonuses[i13];
        }
    }

    /* JADX INFO: renamed from: ru.myspar.core.domain.models.reviewWithBonuses.ReviewWithBonuses$zoijcleaow, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final zoijcleaow serializer() {
            return iobyxmoadg.f87426iobyxmoadg;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ReviewWithBonuses(int i13, int i14, ReviewWithBonusesItem reviewWithBonusesItem, String str, Integer num, long j13, String str2, dvvnrvtcbc dvvnrvtcbcVar) {
        if (62 != (i13 & 62)) {
            sflfametgt.zoijcleaow(i13, 62, iobyxmoadg.f87426iobyxmoadg.iobyxmoadg());
        }
        if ((i13 & 1) == 0) {
            this.id = xg.ppxfxbqfkf.f122316zdlpuopuiu.wkgbmnqykc();
        } else {
            this.id = i14;
        }
        this.reviewItem = reviewWithBonusesItem;
        this.place = str;
        this.bonusQuantity = num;
        this.delayMs = j13;
        this.placeholder = str2;
    }

    public static final /* synthetic */ void nufgyqmvbu(ReviewWithBonuses self, wkgbmnqykc output, gxszxtbevo serialDesc) {
        if (output.zdlpuopuiu(serialDesc, 0) || self.id != xg.ppxfxbqfkf.f122316zdlpuopuiu.wkgbmnqykc()) {
            output.oxmwwwfdhm(serialDesc, 0, self.id);
        }
        output.lqeggnwhkg(serialDesc, 1, ReviewWithBonusesItem.iobyxmoadg.f87430iobyxmoadg, self.reviewItem);
        output.istkbnxepw(serialDesc, 2, self.place);
        output.yggfygwlhe(serialDesc, 3, hcddaimhww.f34142iobyxmoadg, self.bonusQuantity);
        output.vdvldrhtss(serialDesc, 4, self.delayMs);
        output.istkbnxepw(serialDesc, 5, self.placeholder);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewWithBonuses)) {
            return false;
        }
        ReviewWithBonuses reviewWithBonuses = (ReviewWithBonuses) other;
        return this.id == reviewWithBonuses.id && zdlpuopuiu.eablkybsjg(this.reviewItem, reviewWithBonuses.reviewItem) && zdlpuopuiu.eablkybsjg(this.place, reviewWithBonuses.place) && zdlpuopuiu.eablkybsjg(this.bonusQuantity, reviewWithBonuses.bonusQuantity) && this.delayMs == reviewWithBonuses.delayMs && zdlpuopuiu.eablkybsjg(this.placeholder, reviewWithBonuses.placeholder);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final ReviewWithBonusesItem getReviewItem() {
        return this.reviewItem;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.id) * 31) + this.reviewItem.hashCode()) * 31) + this.place.hashCode()) * 31;
        Integer num = this.bonusQuantity;
        return ((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Long.hashCode(this.delayMs)) * 31) + this.placeholder.hashCode();
    }

    public final boolean lqeggnwhkg() {
        return zdlpuopuiu.eablkybsjg(this.place, "main");
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final long getDelayMs() {
        return this.delayMs;
    }

    public String toString() {
        return "ReviewWithBonuses(id=" + this.id + ", reviewItem=" + this.reviewItem + ", place=" + this.place + ", bonusQuantity=" + this.bonusQuantity + ", delayMs=" + this.delayMs + ", placeholder=" + this.placeholder + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        int iIntValue;
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeInt(this.id);
        this.reviewItem.writeToParcel(dest, flags);
        dest.writeString(this.place);
        Integer num = this.bonusQuantity;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeLong(this.delayMs);
        dest.writeString(this.placeholder);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final Integer getBonusQuantity() {
        return this.bonusQuantity;
    }

    public ReviewWithBonuses(int i13, ReviewWithBonusesItem reviewItem, String place, Integer num, long j13, String placeholder) {
        zdlpuopuiu.btonecajqb(reviewItem, "reviewItem");
        zdlpuopuiu.btonecajqb(place, "place");
        zdlpuopuiu.btonecajqb(placeholder, "placeholder");
        this.id = i13;
        this.reviewItem = reviewItem;
        this.place = place;
        this.bonusQuantity = num;
        this.delayMs = j13;
        this.placeholder = placeholder;
    }

    public /* synthetic */ ReviewWithBonuses(int i13, ReviewWithBonusesItem reviewWithBonusesItem, String str, Integer num, long j13, String str2, int i14, gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? xg.ppxfxbqfkf.f122316zdlpuopuiu.wkgbmnqykc() : i13, reviewWithBonusesItem, str, num, j13, str2);
    }
}
