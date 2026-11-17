package modern.payments.ecomAndroid.di.module.paymentFlowModule;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.lereixgezr;
import modern.payments.ecomAndroid.util.CoilImpl;
import tg.iobyxmoadg;
import v6.wkgbmnqykc;
import x6.kcexrzcfyt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lmodern/payments/ecomAndroid/di/module/paymentFlowModule/CoilModule;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Llk/lereixgezr;", "okHttpClient", "Lv6/wkgbmnqykc;", "provideImageLoader", "(Landroid/content/Context;Llk/lereixgezr;)Lv6/wkgbmnqykc;", "Lmodern/payments/ecomAndroid/util/CoilImpl;", "provideCoil", "(Landroid/content/Context;Llk/lereixgezr;)Lmodern/payments/ecomAndroid/util/CoilImpl;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CoilModule {

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.di.module.paymentFlowModule.CoilModule$provideImageLoader$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Llk/lereixgezr;", "invoke", "()Llk/lereixgezr;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    static final class AnonymousClass1 extends jyumaefscl implements iobyxmoadg {
        final /* synthetic */ lereixgezr $okHttpClient;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(lereixgezr lereixgezrVar) {
            super(0);
            this.$okHttpClient = lereixgezrVar;
        }

        @Override // tg.iobyxmoadg
        public final lereixgezr invoke() {
            return this.$okHttpClient;
        }
    }

    private final wkgbmnqykc provideImageLoader(Context context, lereixgezr okHttpClient) {
        wkgbmnqykc.iobyxmoadg iobyxmoadgVarEablkybsjg = new wkgbmnqykc.iobyxmoadg(context).eablkybsjg(new AnonymousClass1(okHttpClient));
        v6.iobyxmoadg.C2883iobyxmoadg c2883iobyxmoadg = new v6.iobyxmoadg.C2883iobyxmoadg();
        c2883iobyxmoadg.ppxfxbqfkf(new kcexrzcfyt.zoijcleaow(false, 1, null));
        return iobyxmoadgVarEablkybsjg.wkgbmnqykc(c2883iobyxmoadg.eablkybsjg()).zoijcleaow();
    }

    public final CoilImpl provideCoil(Context context, lereixgezr okHttpClient) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(okHttpClient, "okHttpClient");
        return new CoilImpl(context, provideImageLoader(context, okHttpClient));
    }
}
