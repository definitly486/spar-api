package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    final CharSequence f9006cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    final int f9007cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    final String f9008esjtqupxsv;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    final ArrayList f9009iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    final int f9010istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    final int[] f9011iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    final int[] f9012jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    final int f9013lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    final boolean f9014lmojexxdyd;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    final int f9015pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    final ArrayList f9016yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    final ArrayList f9017yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    final int[] f9018zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    final CharSequence f9019zynmafqrjb;

    class iobyxmoadg implements Parcelable.Creator {
        iobyxmoadg() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public BackStackRecordState[] newArray(int i13) {
            return new BackStackRecordState[i13];
        }
    }

    BackStackRecordState(androidx.fragment.app.iobyxmoadg iobyxmoadgVar) {
        int size = iobyxmoadgVar.f9256ppxfxbqfkf.size();
        this.f9018zdlpuopuiu = new int[size * 6];
        if (!iobyxmoadgVar.f9246dxjokdxxww) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f9017yggfygwlhe = new ArrayList(size);
        this.f9012jyumaefscl = new int[size];
        this.f9011iwizpuwonk = new int[size];
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            jpowsppfya.iobyxmoadg iobyxmoadgVar2 = (jpowsppfya.iobyxmoadg) iobyxmoadgVar.f9256ppxfxbqfkf.get(i14);
            int i15 = i13 + 1;
            this.f9018zdlpuopuiu[i13] = iobyxmoadgVar2.f9265iobyxmoadg;
            ArrayList arrayList = this.f9017yggfygwlhe;
            Fragment fragment = iobyxmoadgVar2.f9270zoijcleaow;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f9018zdlpuopuiu;
            iArr[i15] = iobyxmoadgVar2.f9268ppxfxbqfkf ? 1 : 0;
            iArr[i13 + 2] = iobyxmoadgVar2.f9269wkgbmnqykc;
            iArr[i13 + 3] = iobyxmoadgVar2.f9263eablkybsjg;
            int i16 = i13 + 5;
            iArr[i13 + 4] = iobyxmoadgVar2.f9264gxszxtbevo;
            i13 += 6;
            iArr[i16] = iobyxmoadgVar2.f9266lqeggnwhkg;
            this.f9012jyumaefscl[i14] = iobyxmoadgVar2.f9267nufgyqmvbu.ordinal();
            this.f9011iwizpuwonk[i14] = iobyxmoadgVar2.f9262dxjokdxxww.ordinal();
        }
        this.f9007cqumvgiudr = iobyxmoadgVar.f9253nufgyqmvbu;
        this.f9008esjtqupxsv = iobyxmoadgVar.f9248gtknphoqwx;
        this.f9013lereixgezr = iobyxmoadgVar.f9234jyumaefscl;
        this.f9015pmvmpeiblj = iobyxmoadgVar.f9245draadjrbmk;
        this.f9019zynmafqrjb = iobyxmoadgVar.f9259wflxmlrfwp;
        this.f9010istkbnxepw = iobyxmoadgVar.f9243agtfadlqog;
        this.f9006cdpycssgdh = iobyxmoadgVar.f9254ojitshcjhn;
        this.f9016yadqdtsiqt = iobyxmoadgVar.f9257rgvfuqvkyq;
        this.f9009iozdgvuglv = iobyxmoadgVar.f9258vdvldrhtss;
        this.f9014lmojexxdyd = iobyxmoadgVar.f9255oxmwwwfdhm;
    }

    private void zoijcleaow(androidx.fragment.app.iobyxmoadg iobyxmoadgVar) {
        int i13 = 0;
        int i14 = 0;
        while (true) {
            boolean z13 = true;
            if (i13 >= this.f9018zdlpuopuiu.length) {
                iobyxmoadgVar.f9253nufgyqmvbu = this.f9007cqumvgiudr;
                iobyxmoadgVar.f9248gtknphoqwx = this.f9008esjtqupxsv;
                iobyxmoadgVar.f9246dxjokdxxww = true;
                iobyxmoadgVar.f9245draadjrbmk = this.f9015pmvmpeiblj;
                iobyxmoadgVar.f9259wflxmlrfwp = this.f9019zynmafqrjb;
                iobyxmoadgVar.f9243agtfadlqog = this.f9010istkbnxepw;
                iobyxmoadgVar.f9254ojitshcjhn = this.f9006cdpycssgdh;
                iobyxmoadgVar.f9257rgvfuqvkyq = this.f9016yadqdtsiqt;
                iobyxmoadgVar.f9258vdvldrhtss = this.f9009iozdgvuglv;
                iobyxmoadgVar.f9255oxmwwwfdhm = this.f9014lmojexxdyd;
                return;
            }
            jpowsppfya.iobyxmoadg iobyxmoadgVar2 = new jpowsppfya.iobyxmoadg();
            int i15 = i13 + 1;
            iobyxmoadgVar2.f9265iobyxmoadg = this.f9018zdlpuopuiu[i13];
            if (FragmentManager.rhgxfdycjh(2)) {
                Log.v("FragmentManager", "Instantiate " + iobyxmoadgVar + " op #" + i14 + " base fragment #" + this.f9018zdlpuopuiu[i15]);
            }
            iobyxmoadgVar2.f9267nufgyqmvbu = androidx.lifecycle.gtknphoqwx.zoijcleaow.values()[this.f9012jyumaefscl[i14]];
            iobyxmoadgVar2.f9262dxjokdxxww = androidx.lifecycle.gtknphoqwx.zoijcleaow.values()[this.f9011iwizpuwonk[i14]];
            int[] iArr = this.f9018zdlpuopuiu;
            int i16 = i13 + 2;
            if (iArr[i15] == 0) {
                z13 = false;
            }
            iobyxmoadgVar2.f9268ppxfxbqfkf = z13;
            int i17 = iArr[i16];
            iobyxmoadgVar2.f9269wkgbmnqykc = i17;
            int i18 = iArr[i13 + 3];
            iobyxmoadgVar2.f9263eablkybsjg = i18;
            int i19 = i13 + 5;
            int i23 = iArr[i13 + 4];
            iobyxmoadgVar2.f9264gxszxtbevo = i23;
            i13 += 6;
            int i24 = iArr[i19];
            iobyxmoadgVar2.f9266lqeggnwhkg = i24;
            iobyxmoadgVar.f9260wkgbmnqykc = i17;
            iobyxmoadgVar.f9247eablkybsjg = i18;
            iobyxmoadgVar.f9249gxszxtbevo = i23;
            iobyxmoadgVar.f9252lqeggnwhkg = i24;
            iobyxmoadgVar.gxszxtbevo(iobyxmoadgVar2);
            i14++;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public androidx.fragment.app.iobyxmoadg eablkybsjg(FragmentManager fragmentManager, Map map) {
        androidx.fragment.app.iobyxmoadg iobyxmoadgVar = new androidx.fragment.app.iobyxmoadg(fragmentManager);
        zoijcleaow(iobyxmoadgVar);
        for (int i13 = 0; i13 < this.f9017yggfygwlhe.size(); i13++) {
            String str = (String) this.f9017yggfygwlhe.get(i13);
            if (str != null) {
                Fragment fragment = (Fragment) map.get(str);
                if (fragment == null) {
                    throw new IllegalStateException("Restoring FragmentTransaction " + this.f9008esjtqupxsv + " failed due to missing saved state for Fragment (" + str + ")");
                }
                ((jpowsppfya.iobyxmoadg) iobyxmoadgVar.f9256ppxfxbqfkf.get(i13)).f9270zoijcleaow = fragment;
            }
        }
        return iobyxmoadgVar;
    }

    public androidx.fragment.app.iobyxmoadg ppxfxbqfkf(FragmentManager fragmentManager) {
        androidx.fragment.app.iobyxmoadg iobyxmoadgVar = new androidx.fragment.app.iobyxmoadg(fragmentManager);
        zoijcleaow(iobyxmoadgVar);
        iobyxmoadgVar.f9234jyumaefscl = this.f9013lereixgezr;
        for (int i13 = 0; i13 < this.f9017yggfygwlhe.size(); i13++) {
            String str = (String) this.f9017yggfygwlhe.get(i13);
            if (str != null) {
                ((jpowsppfya.iobyxmoadg) iobyxmoadgVar.f9256ppxfxbqfkf.get(i13)).f9270zoijcleaow = fragmentManager.ydmasvzmpa(str);
            }
        }
        iobyxmoadgVar.lereixgezr(1);
        return iobyxmoadgVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        parcel.writeIntArray(this.f9018zdlpuopuiu);
        parcel.writeStringList(this.f9017yggfygwlhe);
        parcel.writeIntArray(this.f9012jyumaefscl);
        parcel.writeIntArray(this.f9011iwizpuwonk);
        parcel.writeInt(this.f9007cqumvgiudr);
        parcel.writeString(this.f9008esjtqupxsv);
        parcel.writeInt(this.f9013lereixgezr);
        parcel.writeInt(this.f9015pmvmpeiblj);
        TextUtils.writeToParcel(this.f9019zynmafqrjb, parcel, 0);
        parcel.writeInt(this.f9010istkbnxepw);
        TextUtils.writeToParcel(this.f9006cdpycssgdh, parcel, 0);
        parcel.writeStringList(this.f9016yadqdtsiqt);
        parcel.writeStringList(this.f9009iozdgvuglv);
        parcel.writeInt(this.f9014lmojexxdyd ? 1 : 0);
    }

    BackStackRecordState(Parcel parcel) {
        this.f9018zdlpuopuiu = parcel.createIntArray();
        this.f9017yggfygwlhe = parcel.createStringArrayList();
        this.f9012jyumaefscl = parcel.createIntArray();
        this.f9011iwizpuwonk = parcel.createIntArray();
        this.f9007cqumvgiudr = parcel.readInt();
        this.f9008esjtqupxsv = parcel.readString();
        this.f9013lereixgezr = parcel.readInt();
        this.f9015pmvmpeiblj = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f9019zynmafqrjb = (CharSequence) creator.createFromParcel(parcel);
        this.f9010istkbnxepw = parcel.readInt();
        this.f9006cdpycssgdh = (CharSequence) creator.createFromParcel(parcel);
        this.f9016yadqdtsiqt = parcel.createStringArrayList();
        this.f9009iozdgvuglv = parcel.createStringArrayList();
        this.f9014lmojexxdyd = parcel.readInt() != 0;
    }
}
