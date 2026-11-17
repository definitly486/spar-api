package q4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wkgbmnqykc {
    public byte[] iobyxmoadg(List list, long j13) {
        ArrayList<? extends Parcelable> arrayListZoijcleaow = y2.nufgyqmvbu.zoijcleaow(list, new xa.eablkybsjg() { // from class: q4.ppxfxbqfkf
            @Override // xa.eablkybsjg
            public final Object apply(Object obj) {
                return ((x2.iobyxmoadg) obj).wkgbmnqykc();
            }
        });
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayListZoijcleaow);
        bundle.putLong("d", j13);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
