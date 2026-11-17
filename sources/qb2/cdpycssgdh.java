package qb2;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes6.dex */
public interface cdpycssgdh extends IInterface {

    public static abstract class iobyxmoadg extends Binder implements cdpycssgdh {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public static final /* synthetic */ int f78416eablkybsjg = 0;

        /* JADX INFO: renamed from: qb2.cdpycssgdh$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static class C1756iobyxmoadg implements cdpycssgdh {

            /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
            public final IBinder f78417eablkybsjg;

            public C1756iobyxmoadg(IBinder iBinder) {
                this.f78417eablkybsjg = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f78417eablkybsjg;
            }

            @Override // qb2.cdpycssgdh
            public final void dxjokdxxww(String str, gtknphoqwx.iobyxmoadg iobyxmoadgVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("ru.vk.store.provider.review.ReviewProvider");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iobyxmoadgVar);
                    this.f78417eablkybsjg.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // qb2.cdpycssgdh
            public final void gxszxtbevo(Bundle bundle, String str, gxszxtbevo.iobyxmoadg iobyxmoadgVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("ru.vk.store.provider.review.ReviewProvider");
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iobyxmoadgVar);
                    this.f78417eablkybsjg.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    void dxjokdxxww(String str, gtknphoqwx.iobyxmoadg iobyxmoadgVar);

    void gxszxtbevo(Bundle bundle, String str, gxszxtbevo.iobyxmoadg iobyxmoadgVar);
}
