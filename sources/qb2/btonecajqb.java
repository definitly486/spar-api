package qb2;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import ru.rustore.sdk.core.exception.RuStoreApplicationBannedException;
import ru.rustore.sdk.core.exception.RuStoreException;
import ru.rustore.sdk.core.exception.RuStoreUserBannedException;
import ru.rustore.sdk.core.exception.RuStoreUserUnauthorizedException;
import ru.rustore.sdk.review.errors.RuStoreInvalidReviewInfo;
import ru.rustore.sdk.review.errors.RuStoreRequestLimitReached;
import ru.rustore.sdk.review.errors.RuStoreReviewExists;
import ru.rustore.sdk.review.model.ReviewInfo;

/* JADX INFO: loaded from: classes6.dex */
public abstract class btonecajqb extends Binder implements IInterface {
    public btonecajqb() {
        attachInterface(this, "ru.vk.store.provider.review.RequestReviewFlowCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i13, Parcel parcel, Parcel parcel2, int i14) {
        Object ruStoreUserUnauthorizedException;
        if (i13 >= 1 && i13 <= 16777215) {
            parcel.enforceInterface("ru.vk.store.provider.review.RequestReviewFlowCallback");
        }
        if (i13 == 1598968902) {
            parcel2.writeString("ru.vk.store.provider.review.RequestReviewFlowCallback");
            return true;
        }
        if (i13 == 1) {
            Bundle reviewInfo = (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null);
            gtknphoqwx.iobyxmoadg iobyxmoadgVar = (gtknphoqwx.iobyxmoadg) this;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(reviewInfo, "reviewInfo");
            gtknphoqwx.this.f78428jyumaefscl.invoke(new ReviewInfo(reviewInfo));
            gtknphoqwx gtknphoqwxVar = gtknphoqwx.this;
            lb2.zoijcleaow.zoijcleaow(gtknphoqwxVar.f78430zdlpuopuiu, gtknphoqwxVar);
        } else {
            if (i13 != 2) {
                return super.onTransact(i13, parcel, parcel2, i14);
            }
            int i15 = parcel.readInt();
            String string = parcel.readString();
            gtknphoqwx.iobyxmoadg iobyxmoadgVar2 = (gtknphoqwx.iobyxmoadg) this;
            tg.draadjrbmk draadjrbmkVar = gtknphoqwx.this.f78427iwizpuwonk;
            if (i15 == 1001) {
                ruStoreUserUnauthorizedException = new RuStoreUserUnauthorizedException();
            } else if (i15 == 1004) {
                ruStoreUserUnauthorizedException = new RuStoreUserBannedException();
            } else if (i15 != 1005) {
                switch (i15) {
                    case AuthApiStatusCodes.AUTH_API_ACCESS_FORBIDDEN /* 3001 */:
                        ruStoreUserUnauthorizedException = new RuStoreRequestLimitReached();
                        break;
                    case AuthApiStatusCodes.AUTH_API_CLIENT_ERROR /* 3002 */:
                        ruStoreUserUnauthorizedException = new RuStoreReviewExists();
                        break;
                    case AuthApiStatusCodes.AUTH_API_SERVER_ERROR /* 3003 */:
                        ruStoreUserUnauthorizedException = new RuStoreInvalidReviewInfo();
                        break;
                    default:
                        if (string == null) {
                            string = "";
                        }
                        ruStoreUserUnauthorizedException = new RuStoreException(string);
                        break;
                }
            } else {
                ruStoreUserUnauthorizedException = new RuStoreApplicationBannedException();
            }
            draadjrbmkVar.invoke(ruStoreUserUnauthorizedException);
            gtknphoqwx gtknphoqwxVar2 = gtknphoqwx.this;
            lb2.zoijcleaow.zoijcleaow(gtknphoqwxVar2.f78430zdlpuopuiu, gtknphoqwxVar2);
        }
        parcel2.writeNoException();
        return true;
    }
}
