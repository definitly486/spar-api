package kk;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class pc0 implements androidx.lifecycle.crxdokpmqz.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final Map f58072zoijcleaow;

    public pc0(Map viewModels) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(viewModels, "viewModels");
        this.f58072zoijcleaow = viewModels;
    }

    @Override // androidx.lifecycle.crxdokpmqz.ppxfxbqfkf
    public final androidx.lifecycle.ntlheqmsrt create(Class modelClass) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(modelClass, "modelClass");
        fg.iobyxmoadg iobyxmoadgVar = (fg.iobyxmoadg) this.f58072zoijcleaow.get(modelClass);
        androidx.lifecycle.ntlheqmsrt ntlheqmsrtVar = iobyxmoadgVar != null ? (androidx.lifecycle.ntlheqmsrt) iobyxmoadgVar.get() : null;
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(ntlheqmsrtVar, "null cannot be cast to non-null type T of spay.sdk.di.module.defaultPaymentModule.viewModel.ViewModelFactory.create");
        return ntlheqmsrtVar;
    }
}
