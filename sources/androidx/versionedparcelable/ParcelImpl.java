package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final z5.iobyxmoadg f13695zdlpuopuiu;

    static class iobyxmoadg implements Parcelable.Creator {
        iobyxmoadg() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public ParcelImpl[] newArray(int i13) {
            return new ParcelImpl[i13];
        }
    }

    protected ParcelImpl(Parcel parcel) {
        this.f13695zdlpuopuiu = new androidx.versionedparcelable.iobyxmoadg(parcel).yggfygwlhe();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        new androidx.versionedparcelable.iobyxmoadg(parcel).jpowsppfya(this.f13695zdlpuopuiu);
    }
}
