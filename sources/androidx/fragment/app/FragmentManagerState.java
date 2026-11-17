package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    String f9148cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    ArrayList f9149esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    int f9150iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    BackStackRecordState[] f9151jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    ArrayList f9152lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    ArrayList f9153pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    ArrayList f9154yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    ArrayList f9155zdlpuopuiu;

    class iobyxmoadg implements Parcelable.Creator {
        iobyxmoadg() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState[] newArray(int i13) {
            return new FragmentManagerState[i13];
        }
    }

    public FragmentManagerState() {
        this.f9148cqumvgiudr = null;
        this.f9149esjtqupxsv = new ArrayList();
        this.f9152lereixgezr = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        parcel.writeStringList(this.f9155zdlpuopuiu);
        parcel.writeStringList(this.f9154yggfygwlhe);
        parcel.writeTypedArray(this.f9151jyumaefscl, i13);
        parcel.writeInt(this.f9150iwizpuwonk);
        parcel.writeString(this.f9148cqumvgiudr);
        parcel.writeStringList(this.f9149esjtqupxsv);
        parcel.writeTypedList(this.f9152lereixgezr);
        parcel.writeTypedList(this.f9153pmvmpeiblj);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f9148cqumvgiudr = null;
        this.f9149esjtqupxsv = new ArrayList();
        this.f9152lereixgezr = new ArrayList();
        this.f9155zdlpuopuiu = parcel.createStringArrayList();
        this.f9154yggfygwlhe = parcel.createStringArrayList();
        this.f9151jyumaefscl = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
        this.f9150iwizpuwonk = parcel.readInt();
        this.f9148cqumvgiudr = parcel.readString();
        this.f9149esjtqupxsv = parcel.createStringArrayList();
        this.f9152lereixgezr = parcel.createTypedArrayList(BackStackState.CREATOR);
        this.f9153pmvmpeiblj = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}
