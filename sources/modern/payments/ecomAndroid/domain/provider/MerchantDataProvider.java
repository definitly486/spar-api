package modern.payments.ecomAndroid.domain.provider;

import gg.wwaezpbzkn;
import kotlin.Metadata;
import lg.gxszxtbevo;
import modern.payments.ecomAndroid.domain.model.MerchantInitialData;
import sj.wypolnanlu;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lmodern/payments/ecomAndroid/domain/provider/MerchantDataProvider;", "", "Lmodern/payments/ecomAndroid/domain/model/MerchantInitialData;", "merchantData", "Lgg/wwaezpbzkn;", "updateMerchant", "(Lmodern/payments/ecomAndroid/domain/model/MerchantInitialData;)V", "clearMerchantData", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "Lsj/wypolnanlu;", "getMerchantData", "()Lsj/wypolnanlu;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface MerchantDataProvider {
    Object clearMerchantData(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    wypolnanlu getMerchantData();

    void updateMerchant(MerchantInitialData merchantData);
}
