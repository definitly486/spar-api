package ru.myspar.common.view.promo_code;

import android.os.Parcel;
import android.os.Parcelable;
import et.iobyxmoadg;
import j0.l;
import k30.draadjrbmk;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import vu.btonecajqb;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0001,B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u0018\u0010\u0013J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H×\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(¨\u0006-"}, d2 = {"Lru/myspar/common/view/promo_code/PromoCodeEditorState;", "Landroid/os/Parcelable;", "Lp0/tzroggbefp;", "promoCodeFromInput", "", "promoCodeFromServer", "Lvu/btonecajqb;", "stateFromInput", "stateFromServer", "<init>", "(Lp0/tzroggbefp;Ljava/lang/String;Lvu/btonecajqb;Lvu/btonecajqb;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "ppxfxbqfkf", "(Lp0/tzroggbefp;Ljava/lang/String;Lvu/btonecajqb;Lvu/btonecajqb;)Lru/myspar/common/view/promo_code/PromoCodeEditorState;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lp0/tzroggbefp;", "gxszxtbevo", "()Lp0/tzroggbefp;", "yggfygwlhe", "Ljava/lang/String;", "lqeggnwhkg", "jyumaefscl", "Lvu/btonecajqb;", "nufgyqmvbu", "()Lvu/btonecajqb;", "iwizpuwonk", "dxjokdxxww", "cqumvgiudr", "iobyxmoadg", "view_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PromoCodeEditorState implements Parcelable {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final PromoCodeEditorState f86289esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final btonecajqb stateFromServer;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final btonecajqb stateFromInput;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String promoCodeFromServer;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final tzroggbefp promoCodeFromInput;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<PromoCodeEditorState> CREATOR = new zoijcleaow();

    /* JADX INFO: renamed from: ru.myspar.common.view.promo_code.PromoCodeEditorState$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final PromoCodeEditorState iobyxmoadg() {
            return PromoCodeEditorState.f86289esjtqupxsv;
        }

        private Companion() {
        }
    }

    public static final class zoijcleaow implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final PromoCodeEditorState createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new PromoCodeEditorState(iobyxmoadg.f31924iobyxmoadg.iobyxmoadg(parcel), parcel.readString(), btonecajqb.valueOf(parcel.readString()), btonecajqb.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final PromoCodeEditorState[] newArray(int i13) {
            return new PromoCodeEditorState[i13];
        }
    }

    static {
        tzroggbefp tzroggbefpVar = new tzroggbefp(draadjrbmk.ppxfxbqfkf(), 0L, (l) null, 6, (gtknphoqwx) null);
        String strPpxfxbqfkf = draadjrbmk.ppxfxbqfkf();
        btonecajqb btonecajqbVar = btonecajqb.NOT_ENTERED;
        f86289esjtqupxsv = new PromoCodeEditorState(tzroggbefpVar, strPpxfxbqfkf, btonecajqbVar, btonecajqbVar);
    }

    public PromoCodeEditorState(tzroggbefp promoCodeFromInput, String promoCodeFromServer, btonecajqb stateFromInput, btonecajqb stateFromServer) {
        zdlpuopuiu.btonecajqb(promoCodeFromInput, "promoCodeFromInput");
        zdlpuopuiu.btonecajqb(promoCodeFromServer, "promoCodeFromServer");
        zdlpuopuiu.btonecajqb(stateFromInput, "stateFromInput");
        zdlpuopuiu.btonecajqb(stateFromServer, "stateFromServer");
        this.promoCodeFromInput = promoCodeFromInput;
        this.promoCodeFromServer = promoCodeFromServer;
        this.stateFromInput = stateFromInput;
        this.stateFromServer = stateFromServer;
    }

    public static /* synthetic */ PromoCodeEditorState eablkybsjg(PromoCodeEditorState promoCodeEditorState, tzroggbefp tzroggbefpVar, String str, btonecajqb btonecajqbVar, btonecajqb btonecajqbVar2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            tzroggbefpVar = promoCodeEditorState.promoCodeFromInput;
        }
        if ((i13 & 2) != 0) {
            str = promoCodeEditorState.promoCodeFromServer;
        }
        if ((i13 & 4) != 0) {
            btonecajqbVar = promoCodeEditorState.stateFromInput;
        }
        if ((i13 & 8) != 0) {
            btonecajqbVar2 = promoCodeEditorState.stateFromServer;
        }
        return promoCodeEditorState.ppxfxbqfkf(tzroggbefpVar, str, btonecajqbVar, btonecajqbVar2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final btonecajqb getStateFromServer() {
        return this.stateFromServer;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoCodeEditorState)) {
            return false;
        }
        PromoCodeEditorState promoCodeEditorState = (PromoCodeEditorState) other;
        return zdlpuopuiu.eablkybsjg(this.promoCodeFromInput, promoCodeEditorState.promoCodeFromInput) && zdlpuopuiu.eablkybsjg(this.promoCodeFromServer, promoCodeEditorState.promoCodeFromServer) && this.stateFromInput == promoCodeEditorState.stateFromInput && this.stateFromServer == promoCodeEditorState.stateFromServer;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final tzroggbefp getPromoCodeFromInput() {
        return this.promoCodeFromInput;
    }

    public int hashCode() {
        return (((((this.promoCodeFromInput.hashCode() * 31) + this.promoCodeFromServer.hashCode()) * 31) + this.stateFromInput.hashCode()) * 31) + this.stateFromServer.hashCode();
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final String getPromoCodeFromServer() {
        return this.promoCodeFromServer;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final btonecajqb getStateFromInput() {
        return this.stateFromInput;
    }

    public final PromoCodeEditorState ppxfxbqfkf(tzroggbefp promoCodeFromInput, String promoCodeFromServer, btonecajqb stateFromInput, btonecajqb stateFromServer) {
        zdlpuopuiu.btonecajqb(promoCodeFromInput, "promoCodeFromInput");
        zdlpuopuiu.btonecajqb(promoCodeFromServer, "promoCodeFromServer");
        zdlpuopuiu.btonecajqb(stateFromInput, "stateFromInput");
        zdlpuopuiu.btonecajqb(stateFromServer, "stateFromServer");
        return new PromoCodeEditorState(promoCodeFromInput, promoCodeFromServer, stateFromInput, stateFromServer);
    }

    public String toString() {
        return "PromoCodeEditorState(promoCodeFromInput=" + this.promoCodeFromInput + ", promoCodeFromServer=" + this.promoCodeFromServer + ", stateFromInput=" + this.stateFromInput + ", stateFromServer=" + this.stateFromServer + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        iobyxmoadg.f31924iobyxmoadg.zoijcleaow(this.promoCodeFromInput, dest, flags);
        dest.writeString(this.promoCodeFromServer);
        dest.writeString(this.stateFromInput.name());
        dest.writeString(this.stateFromServer.name());
    }
}
