package modern.payments.ecomAndroid.data.provider;

import gg.wwaezpbzkn;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import modern.payments.ecomAndroid.domain.model.MerchantInitialData;
import modern.payments.ecomAndroid.domain.provider.MerchantDataProvider;
import sj.dxjokdxxww;
import sj.kegysxyocb;
import sj.wypolnanlu;
import sj.zynmafqrjb;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lmodern/payments/ecomAndroid/data/provider/MerchantDataProviderImpl;", "Lmodern/payments/ecomAndroid/domain/provider/MerchantDataProvider;", "<init>", "()V", "Lmodern/payments/ecomAndroid/domain/model/MerchantInitialData;", "merchantData", "Lgg/wwaezpbzkn;", "updateMerchant", "(Lmodern/payments/ecomAndroid/domain/model/MerchantInitialData;)V", "clearMerchantData", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "Lsj/zynmafqrjb;", "_merchantData", "Lsj/zynmafqrjb;", "Lsj/wypolnanlu;", "Lsj/wypolnanlu;", "getMerchantData", "()Lsj/wypolnanlu;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MerchantDataProviderImpl implements MerchantDataProvider {
    private final zynmafqrjb _merchantData;
    private final wypolnanlu merchantData;

    public MerchantDataProviderImpl() {
        zynmafqrjb zynmafqrjbVarIobyxmoadg = kegysxyocb.iobyxmoadg(null);
        this._merchantData = zynmafqrjbVarIobyxmoadg;
        this.merchantData = dxjokdxxww.zoijcleaow(zynmafqrjbVarIobyxmoadg);
    }

    @Override // modern.payments.ecomAndroid.domain.provider.MerchantDataProvider
    public Object clearMerchantData(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        this._merchantData.setValue(null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // modern.payments.ecomAndroid.domain.provider.MerchantDataProvider
    public wypolnanlu getMerchantData() {
        return this.merchantData;
    }

    @Override // modern.payments.ecomAndroid.domain.provider.MerchantDataProvider
    public void updateMerchant(MerchantInitialData merchantData) {
        zdlpuopuiu.btonecajqb(merchantData, "merchantData");
        this._merchantData.setValue(merchantData);
    }
}
