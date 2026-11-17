package modern.payments.ecomAndroid.di.module.paymentFlowModule.viewModel;

import ah.wkgbmnqykc;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.ntlheqmsrt;
import fg.iobyxmoadg;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.di.scope.PaymentFlowScope;

/* JADX INFO: loaded from: classes3.dex */
@PaymentFlowScope
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B+\b\u0007\u0012 \u0010\u0007\u001a\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000b\u001a\u00028\u0001\"\b\b\u0001\u0010\u0001*\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR.\u0010\u0007\u001a\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\r¨\u0006\u000e"}, d2 = {"Lmodern/payments/ecomAndroid/di/module/paymentFlowModule/viewModel/ViewModelFactory;", "T", "Landroidx/lifecycle/crxdokpmqz$ppxfxbqfkf;", "", "Ljava/lang/Class;", "Landroidx/lifecycle/ntlheqmsrt;", "Lfg/iobyxmoadg;", "viewModels", "<init>", "(Ljava/util/Map;)V", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/ntlheqmsrt;", "Ljava/util/Map;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ViewModelFactory<T> implements crxdokpmqz.ppxfxbqfkf {
    private final Map<Class<? extends ntlheqmsrt>, iobyxmoadg> viewModels;

    public ViewModelFactory(Map<Class<? extends ntlheqmsrt>, iobyxmoadg> viewModels) {
        zdlpuopuiu.btonecajqb(viewModels, "viewModels");
        this.viewModels = viewModels;
    }

    @Override // androidx.lifecycle.crxdokpmqz.ppxfxbqfkf
    public /* bridge */ /* synthetic */ ntlheqmsrt create(wkgbmnqykc wkgbmnqykcVar, t2.iobyxmoadg iobyxmoadgVar) {
        return super.create(wkgbmnqykcVar, iobyxmoadgVar);
    }

    @Override // androidx.lifecycle.crxdokpmqz.ppxfxbqfkf
    public /* bridge */ /* synthetic */ ntlheqmsrt create(Class cls, t2.iobyxmoadg iobyxmoadgVar) {
        return super.create(cls, iobyxmoadgVar);
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Landroidx/lifecycle/ntlheqmsrt;>(Ljava/lang/Class<TT;>;)TT; */
    @Override // androidx.lifecycle.crxdokpmqz.ppxfxbqfkf
    public ntlheqmsrt create(Class modelClass) {
        zdlpuopuiu.btonecajqb(modelClass, "modelClass");
        iobyxmoadg iobyxmoadgVar = this.viewModels.get(modelClass);
        ntlheqmsrt ntlheqmsrtVar = iobyxmoadgVar != null ? (ntlheqmsrt) iobyxmoadgVar.get() : null;
        zdlpuopuiu.nufgyqmvbu(ntlheqmsrtVar, "null cannot be cast to non-null type T of modern.payments.ecomAndroid.di.module.paymentFlowModule.viewModel.ViewModelFactory.create");
        return ntlheqmsrtVar;
    }
}
