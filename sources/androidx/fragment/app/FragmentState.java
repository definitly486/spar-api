package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    final boolean f9156cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    final int f9157cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    final int f9158esjtqupxsv;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    final String f9159iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    final boolean f9160istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    final boolean f9161iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    final boolean f9162jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    final String f9163lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    final int f9164lmojexxdyd;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    final boolean f9165pmvmpeiblj;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    final boolean f9166wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    final int f9167yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    final String f9168yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    final String f9169zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    final boolean f9170zynmafqrjb;

    class iobyxmoadg implements Parcelable.Creator {
        iobyxmoadg() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public FragmentState[] newArray(int i13) {
            return new FragmentState[i13];
        }
    }

    FragmentState(Fragment fragment) {
        this.f9169zdlpuopuiu = fragment.getClass().getName();
        this.f9168yggfygwlhe = fragment.mWho;
        this.f9162jyumaefscl = fragment.mFromLayout;
        this.f9161iwizpuwonk = fragment.mInDynamicContainer;
        this.f9157cqumvgiudr = fragment.mFragmentId;
        this.f9158esjtqupxsv = fragment.mContainerId;
        this.f9163lereixgezr = fragment.mTag;
        this.f9165pmvmpeiblj = fragment.mRetainInstance;
        this.f9170zynmafqrjb = fragment.mRemoving;
        this.f9160istkbnxepw = fragment.mDetached;
        this.f9156cdpycssgdh = fragment.mHidden;
        this.f9167yadqdtsiqt = fragment.mMaxState.ordinal();
        this.f9159iozdgvuglv = fragment.mTargetWho;
        this.f9164lmojexxdyd = fragment.mTargetRequestCode;
        this.f9166wwaezpbzkn = fragment.mUserVisibleHint;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder(UserVerificationMethods.USER_VERIFY_PATTERN);
        sb3.append("FragmentState{");
        sb3.append(this.f9169zdlpuopuiu);
        sb3.append(" (");
        sb3.append(this.f9168yggfygwlhe);
        sb3.append(")}:");
        if (this.f9162jyumaefscl) {
            sb3.append(" fromLayout");
        }
        if (this.f9161iwizpuwonk) {
            sb3.append(" dynamicContainer");
        }
        if (this.f9158esjtqupxsv != 0) {
            sb3.append(" id=0x");
            sb3.append(Integer.toHexString(this.f9158esjtqupxsv));
        }
        String str = this.f9163lereixgezr;
        if (str != null && !str.isEmpty()) {
            sb3.append(" tag=");
            sb3.append(this.f9163lereixgezr);
        }
        if (this.f9165pmvmpeiblj) {
            sb3.append(" retainInstance");
        }
        if (this.f9170zynmafqrjb) {
            sb3.append(" removing");
        }
        if (this.f9160istkbnxepw) {
            sb3.append(" detached");
        }
        if (this.f9156cdpycssgdh) {
            sb3.append(" hidden");
        }
        if (this.f9159iozdgvuglv != null) {
            sb3.append(" targetWho=");
            sb3.append(this.f9159iozdgvuglv);
            sb3.append(" targetRequestCode=");
            sb3.append(this.f9164lmojexxdyd);
        }
        if (this.f9166wwaezpbzkn) {
            sb3.append(" userVisibleHint");
        }
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f9169zdlpuopuiu);
        parcel.writeString(this.f9168yggfygwlhe);
        parcel.writeInt(this.f9162jyumaefscl ? 1 : 0);
        parcel.writeInt(this.f9161iwizpuwonk ? 1 : 0);
        parcel.writeInt(this.f9157cqumvgiudr);
        parcel.writeInt(this.f9158esjtqupxsv);
        parcel.writeString(this.f9163lereixgezr);
        parcel.writeInt(this.f9165pmvmpeiblj ? 1 : 0);
        parcel.writeInt(this.f9170zynmafqrjb ? 1 : 0);
        parcel.writeInt(this.f9160istkbnxepw ? 1 : 0);
        parcel.writeInt(this.f9156cdpycssgdh ? 1 : 0);
        parcel.writeInt(this.f9167yadqdtsiqt);
        parcel.writeString(this.f9159iozdgvuglv);
        parcel.writeInt(this.f9164lmojexxdyd);
        parcel.writeInt(this.f9166wwaezpbzkn ? 1 : 0);
    }

    Fragment zoijcleaow(jyumaefscl jyumaefsclVar, ClassLoader classLoader) {
        Fragment fragmentIobyxmoadg = jyumaefsclVar.iobyxmoadg(classLoader, this.f9169zdlpuopuiu);
        fragmentIobyxmoadg.mWho = this.f9168yggfygwlhe;
        fragmentIobyxmoadg.mFromLayout = this.f9162jyumaefscl;
        fragmentIobyxmoadg.mInDynamicContainer = this.f9161iwizpuwonk;
        fragmentIobyxmoadg.mRestored = true;
        fragmentIobyxmoadg.mFragmentId = this.f9157cqumvgiudr;
        fragmentIobyxmoadg.mContainerId = this.f9158esjtqupxsv;
        fragmentIobyxmoadg.mTag = this.f9163lereixgezr;
        fragmentIobyxmoadg.mRetainInstance = this.f9165pmvmpeiblj;
        fragmentIobyxmoadg.mRemoving = this.f9170zynmafqrjb;
        fragmentIobyxmoadg.mDetached = this.f9160istkbnxepw;
        fragmentIobyxmoadg.mHidden = this.f9156cdpycssgdh;
        fragmentIobyxmoadg.mMaxState = androidx.lifecycle.gtknphoqwx.zoijcleaow.values()[this.f9167yadqdtsiqt];
        fragmentIobyxmoadg.mTargetWho = this.f9159iozdgvuglv;
        fragmentIobyxmoadg.mTargetRequestCode = this.f9164lmojexxdyd;
        fragmentIobyxmoadg.mUserVisibleHint = this.f9166wwaezpbzkn;
        return fragmentIobyxmoadg;
    }

    FragmentState(Parcel parcel) {
        this.f9169zdlpuopuiu = parcel.readString();
        this.f9168yggfygwlhe = parcel.readString();
        this.f9162jyumaefscl = parcel.readInt() != 0;
        this.f9161iwizpuwonk = parcel.readInt() != 0;
        this.f9157cqumvgiudr = parcel.readInt();
        this.f9158esjtqupxsv = parcel.readInt();
        this.f9163lereixgezr = parcel.readString();
        this.f9165pmvmpeiblj = parcel.readInt() != 0;
        this.f9170zynmafqrjb = parcel.readInt() != 0;
        this.f9160istkbnxepw = parcel.readInt() != 0;
        this.f9156cdpycssgdh = parcel.readInt() != 0;
        this.f9167yadqdtsiqt = parcel.readInt();
        this.f9159iozdgvuglv = parcel.readString();
        this.f9164lmojexxdyd = parcel.readInt();
        this.f9166wwaezpbzkn = parcel.readInt() != 0;
    }
}
