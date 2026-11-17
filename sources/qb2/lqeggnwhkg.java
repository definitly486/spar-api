package qb2;

import android.os.Binder;
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

/* JADX INFO: loaded from: classes6.dex */
public abstract class lqeggnwhkg extends Binder implements IInterface {
    public lqeggnwhkg() {
        attachInterface(this, "ru.vk.store.provider.review.LaunchReviewFlowCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i13, Parcel parcel, Parcel parcel2, int i14) {
        Object ruStoreUserUnauthorizedException;
        if (i13 >= 1 && i13 <= 16777215) {
            parcel.enforceInterface("ru.vk.store.provider.review.LaunchReviewFlowCallback");
        }
        if (i13 == 1598968902) {
            parcel2.writeString("ru.vk.store.provider.review.LaunchReviewFlowCallback");
            return true;
        }
        if (i13 == 1) {
            gxszxtbevo.iobyxmoadg iobyxmoadgVar = (gxszxtbevo.iobyxmoadg) this;
            gxszxtbevo.this.f78433iwizpuwonk.invoke();
            gxszxtbevo gxszxtbevoVar = gxszxtbevo.this;
            lb2.zoijcleaow.zoijcleaow(gxszxtbevoVar.f78436zdlpuopuiu, gxszxtbevoVar);
        } else {
            if (i13 != 2) {
                return super.onTransact(i13, parcel, parcel2, i14);
            }
            int i15 = parcel.readInt();
            String string = parcel.readString();
            gxszxtbevo.iobyxmoadg iobyxmoadgVar2 = (gxszxtbevo.iobyxmoadg) this;
            tg.draadjrbmk draadjrbmkVar = gxszxtbevo.this.f78432cqumvgiudr;
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
            gxszxtbevo gxszxtbevoVar2 = gxszxtbevo.this;
            lb2.zoijcleaow.zoijcleaow(gxszxtbevoVar2.f78436zdlpuopuiu, gxszxtbevoVar2);
        }
        parcel2.writeNoException();
        return true;
    }
}
