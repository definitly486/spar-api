package modern.payments.ecomAndroid.presentation.fragment.paymentSbp;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import modern.payments.ecomAndroid.domain.model.response.EcomSbpConfig;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u008a@"}, d2 = {"<anonymous>", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/SbpScreenState;", "searchInput", "", "bankList", "", "Lmodern/payments/ecomAndroid/domain/model/response/EcomSbpConfig$SbpBankInfo;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpViewModel$screenState$2", f = "EcomSbpViewModel.kt", l = {}, m = "invokeSuspend")
final class EcomSbpViewModel$screenState$2 extends draadjrbmk implements vdvldrhtss {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ EcomSbpViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EcomSbpViewModel$screenState$2(EcomSbpViewModel ecomSbpViewModel, lg.gxszxtbevo<? super EcomSbpViewModel$screenState$2> gxszxtbevoVar) {
        super(3, gxszxtbevoVar);
        this.this$0 = ecomSbpViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        List listSearch;
        mg.zoijcleaow.gxszxtbevo();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        zdlpuopuiu.zoijcleaow(obj);
        String str = (String) this.L$0;
        List list = (List) this.L$1;
        if (str.length() == 0) {
            listSearch = jyumaefscl.b(this.this$0.filterAvailable(list));
        } else {
            EcomSbpViewModel ecomSbpViewModel = this.this$0;
            listSearch = ecomSbpViewModel.search(ecomSbpViewModel.filterAvailable(list), str);
        }
        return new SbpScreenState(listSearch, str);
    }

    @Override // tg.vdvldrhtss
    public final Object invoke(String str, List<EcomSbpConfig.SbpBankInfo> list, lg.gxszxtbevo<? super SbpScreenState> gxszxtbevoVar) {
        EcomSbpViewModel$screenState$2 ecomSbpViewModel$screenState$2 = new EcomSbpViewModel$screenState$2(this.this$0, gxszxtbevoVar);
        ecomSbpViewModel$screenState$2.L$0 = str;
        ecomSbpViewModel$screenState$2.L$1 = list;
        return ecomSbpViewModel$screenState$2.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
    }
}
