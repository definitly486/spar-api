package ru.myspar.proloyalty.cart.impl.utils;

import android.os.Parcel;
import android.os.Parcelable;
import j0.l;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import yr0.iobyxmoadg;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001&B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H×\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000bH×\u0001¢\u0006\u0004\b\u0017\u0010\u0011J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H×\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b\u0006\u0010#¨\u0006'"}, d2 = {"Lru/myspar/proloyalty/cart/impl/utils/BonusesEditorState;", "Landroid/os/Parcelable;", "Lp0/tzroggbefp;", "value", "", "isEnabled", "isAvailableEditable", "<init>", "(Lp0/tzroggbefp;ZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "ppxfxbqfkf", "(Lp0/tzroggbefp;ZZ)Lru/myspar/proloyalty/cart/impl/utils/BonusesEditorState;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lp0/tzroggbefp;", "gxszxtbevo", "()Lp0/tzroggbefp;", "yggfygwlhe", "Z", "lqeggnwhkg", "()Z", "jyumaefscl", "iwizpuwonk", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BonusesEditorState implements Parcelable {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAvailableEditable;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEnabled;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final tzroggbefp value;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<BonusesEditorState> CREATOR = new zoijcleaow();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final BonusesEditorState f93015cqumvgiudr = new BonusesEditorState(new tzroggbefp("", 0, (l) null, 6, (gtknphoqwx) null), false, true);

    /* JADX INFO: renamed from: ru.myspar.proloyalty.cart.impl.utils.BonusesEditorState$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final BonusesEditorState iobyxmoadg() {
            return BonusesEditorState.f93015cqumvgiudr;
        }

        private Companion() {
        }
    }

    public static final class zoijcleaow implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final BonusesEditorState createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new BonusesEditorState(iobyxmoadg.f126300iobyxmoadg.iobyxmoadg(parcel), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final BonusesEditorState[] newArray(int i13) {
            return new BonusesEditorState[i13];
        }
    }

    public BonusesEditorState(tzroggbefp value, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(value, "value");
        this.value = value;
        this.isEnabled = z13;
        this.isAvailableEditable = z14;
    }

    public static /* synthetic */ BonusesEditorState eablkybsjg(BonusesEditorState bonusesEditorState, tzroggbefp tzroggbefpVar, boolean z13, boolean z14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            tzroggbefpVar = bonusesEditorState.value;
        }
        if ((i13 & 2) != 0) {
            z13 = bonusesEditorState.isEnabled;
        }
        if ((i13 & 4) != 0) {
            z14 = bonusesEditorState.isAvailableEditable;
        }
        return bonusesEditorState.ppxfxbqfkf(tzroggbefpVar, z13, z14);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BonusesEditorState)) {
            return false;
        }
        BonusesEditorState bonusesEditorState = (BonusesEditorState) other;
        return zdlpuopuiu.eablkybsjg(this.value, bonusesEditorState.value) && this.isEnabled == bonusesEditorState.isEnabled && this.isAvailableEditable == bonusesEditorState.isAvailableEditable;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final tzroggbefp getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((this.value.hashCode() * 31) + Boolean.hashCode(this.isEnabled)) * 31) + Boolean.hashCode(this.isAvailableEditable);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public final BonusesEditorState ppxfxbqfkf(tzroggbefp value, boolean isEnabled, boolean isAvailableEditable) {
        zdlpuopuiu.btonecajqb(value, "value");
        return new BonusesEditorState(value, isEnabled, isAvailableEditable);
    }

    public String toString() {
        return "BonusesEditorState(value=" + this.value + ", isEnabled=" + this.isEnabled + ", isAvailableEditable=" + this.isAvailableEditable + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        iobyxmoadg.f126300iobyxmoadg.zoijcleaow(this.value, dest, flags);
        dest.writeInt(this.isEnabled ? 1 : 0);
        dest.writeInt(this.isAvailableEditable ? 1 : 0);
    }
}
