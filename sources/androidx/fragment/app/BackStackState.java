package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    final List f9020yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    final List f9021zdlpuopuiu;

    class iobyxmoadg implements Parcelable.Creator {
        iobyxmoadg() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public BackStackState[] newArray(int i13) {
            return new BackStackState[i13];
        }
    }

    BackStackState(List list, List list2) {
        this.f9021zdlpuopuiu = list;
        this.f9020yggfygwlhe = list2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        parcel.writeStringList(this.f9021zdlpuopuiu);
        parcel.writeTypedList(this.f9020yggfygwlhe);
    }

    List zoijcleaow(FragmentManager fragmentManager, Map map) {
        HashMap map2 = new HashMap(this.f9021zdlpuopuiu.size());
        for (String str : this.f9021zdlpuopuiu) {
            Fragment fragment = (Fragment) map.get(str);
            if (fragment != null) {
                map2.put(fragment.mWho, fragment);
            } else {
                Bundle bundleZynmafqrjb = fragmentManager.skhdrjzrfn().zynmafqrjb(str, null);
                if (bundleZynmafqrjb != null) {
                    ClassLoader classLoader = fragmentManager.lxfrhoxuzk().gxszxtbevo().getClassLoader();
                    Fragment fragmentZoijcleaow = ((FragmentState) bundleZynmafqrjb.getParcelable("state")).zoijcleaow(fragmentManager.dvvnrvtcbc(), classLoader);
                    fragmentZoijcleaow.mSavedFragmentState = bundleZynmafqrjb;
                    if (bundleZynmafqrjb.getBundle("savedInstanceState") == null) {
                        fragmentZoijcleaow.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
                    }
                    Bundle bundle = bundleZynmafqrjb.getBundle("arguments");
                    if (bundle != null) {
                        bundle.setClassLoader(classLoader);
                    }
                    fragmentZoijcleaow.setArguments(bundle);
                    map2.put(fragmentZoijcleaow.mWho, fragmentZoijcleaow);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f9020yggfygwlhe.iterator();
        while (it.hasNext()) {
            arrayList.add(((BackStackRecordState) it.next()).eablkybsjg(fragmentManager, map2));
        }
        return arrayList;
    }

    BackStackState(Parcel parcel) {
        this.f9021zdlpuopuiu = parcel.createStringArrayList();
        this.f9020yggfygwlhe = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }
}
