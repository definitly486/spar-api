package q4;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow {
    public eablkybsjg iobyxmoadg(long j13, byte[] bArr, int i13, int i14) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, i13, i14);
        parcelObtain.setDataPosition(0);
        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
        parcelObtain.recycle();
        return new eablkybsjg(y2.nufgyqmvbu.iobyxmoadg(new xa.eablkybsjg() { // from class: q4.iobyxmoadg
            @Override // xa.eablkybsjg
            public final Object apply(Object obj) {
                return x2.iobyxmoadg.zoijcleaow((Bundle) obj);
            }
        }, (ArrayList) y2.iobyxmoadg.eablkybsjg(bundle.getParcelableArrayList("c"))), j13, bundle.getLong("d"));
    }
}
