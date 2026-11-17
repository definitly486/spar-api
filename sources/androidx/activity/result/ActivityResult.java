package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class ActivityResult implements Parcelable {
    public static final Parcelable.Creator<ActivityResult> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Intent f2346yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f2347zdlpuopuiu;

    class iobyxmoadg implements Parcelable.Creator {
        iobyxmoadg() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public ActivityResult createFromParcel(Parcel parcel) {
            return new ActivityResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public ActivityResult[] newArray(int i13) {
            return new ActivityResult[i13];
        }
    }

    public ActivityResult(int i13, Intent intent) {
        this.f2347zdlpuopuiu = i13;
        this.f2346yggfygwlhe = intent;
    }

    public static String eablkybsjg(int i13) {
        if (i13 != -1) {
            return i13 != 0 ? String.valueOf(i13) : "RESULT_CANCELED";
        }
        return "RESULT_OK";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int ppxfxbqfkf() {
        return this.f2347zdlpuopuiu;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + eablkybsjg(this.f2347zdlpuopuiu) + ", data=" + this.f2346yggfygwlhe + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f2347zdlpuopuiu);
        parcel.writeInt(this.f2346yggfygwlhe == null ? 0 : 1);
        Intent intent = this.f2346yggfygwlhe;
        if (intent != null) {
            intent.writeToParcel(parcel, i13);
        }
    }

    public Intent zoijcleaow() {
        return this.f2346yggfygwlhe;
    }

    ActivityResult(Parcel parcel) {
        this.f2347zdlpuopuiu = parcel.readInt();
        this.f2346yggfygwlhe = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
