package modern.payments.ecomAndroid;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import mg.zoijcleaow;
import modern.payments.ecomAndroid.util.event.Event;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lmodern/payments/ecomAndroid/util/event/Event;", "", "event"}, k = 3, mv = {1, 9, 0}, xi = 48)
@gxszxtbevo(c = "modern.payments.ecomAndroid.EcomActivityViewModel$bottomSheetShowEvent$1", f = "EcomActivityViewModel.kt", l = {}, m = "invokeSuspend")
final class EcomActivityViewModel$bottomSheetShowEvent$1 extends draadjrbmk implements rgvfuqvkyq {
    /* synthetic */ boolean Z$0;
    int label;

    EcomActivityViewModel$bottomSheetShowEvent$1(lg.gxszxtbevo<? super EcomActivityViewModel$bottomSheetShowEvent$1> gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
        EcomActivityViewModel$bottomSheetShowEvent$1 ecomActivityViewModel$bottomSheetShowEvent$1 = new EcomActivityViewModel$bottomSheetShowEvent$1(gxszxtbevoVar);
        ecomActivityViewModel$bottomSheetShowEvent$1.Z$0 = ((Boolean) obj).booleanValue();
        return ecomActivityViewModel$bottomSheetShowEvent$1;
    }

    @Override // tg.rgvfuqvkyq
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Boolean) obj).booleanValue(), (lg.gxszxtbevo<? super Event<Boolean>>) obj2);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        zoijcleaow.gxszxtbevo();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        zdlpuopuiu.zoijcleaow(obj);
        return new Event(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(this.Z$0));
    }

    public final Object invoke(boolean z13, lg.gxszxtbevo<? super Event<Boolean>> gxszxtbevoVar) {
        return ((EcomActivityViewModel$bottomSheetShowEvent$1) create(Boolean.valueOf(z13), gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
    }
}
