package modern.payments.ecomAndroid.data.util.clearSdkUtil;

import gg.wwaezpbzkn;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import mg.zoijcleaow;
import modern.payments.ecomAndroid.domain.provider.IpAddressProvider;
import modern.payments.ecomAndroid.domain.provider.MerchantDataProvider;
import modern.payments.ecomAndroid.util.clearSdkUtil.ClearSdkUtil;
import modern.payments.ecomAndroid.util.headerBuilder.SetCookieHandler;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, d2 = {"Lmodern/payments/ecomAndroid/data/util/clearSdkUtil/ClearSdkUtilImpl;", "Lmodern/payments/ecomAndroid/util/clearSdkUtil/ClearSdkUtil;", "Lmodern/payments/ecomAndroid/util/headerBuilder/SetCookieHandler;", "setCookieHandler", "Lmodern/payments/ecomAndroid/domain/provider/IpAddressProvider;", "ipAddressProvider", "Lmodern/payments/ecomAndroid/domain/provider/MerchantDataProvider;", "merchantDataProvider", "<init>", "(Lmodern/payments/ecomAndroid/util/headerBuilder/SetCookieHandler;Lmodern/payments/ecomAndroid/domain/provider/IpAddressProvider;Lmodern/payments/ecomAndroid/domain/provider/MerchantDataProvider;)V", "Lgg/wwaezpbzkn;", "clearSdkCache", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/util/headerBuilder/SetCookieHandler;", "Lmodern/payments/ecomAndroid/domain/provider/IpAddressProvider;", "Lmodern/payments/ecomAndroid/domain/provider/MerchantDataProvider;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ClearSdkUtilImpl implements ClearSdkUtil {
    private final IpAddressProvider ipAddressProvider;
    private final MerchantDataProvider merchantDataProvider;
    private final SetCookieHandler setCookieHandler;

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.data.util.clearSdkUtil.ClearSdkUtilImpl$clearSdkCache$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @gxszxtbevo(c = "modern.payments.ecomAndroid.data.util.clearSdkUtil.ClearSdkUtilImpl", f = "ClearSdkUtilImpl.kt", l = {15, 16, 17}, m = "clearSdkCache")
    static final class AnonymousClass1 extends wkgbmnqykc {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(lg.gxszxtbevo<? super AnonymousClass1> gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ClearSdkUtilImpl.this.clearSdkCache(this);
        }
    }

    public ClearSdkUtilImpl(SetCookieHandler setCookieHandler, IpAddressProvider ipAddressProvider, MerchantDataProvider merchantDataProvider) {
        zdlpuopuiu.btonecajqb(setCookieHandler, "setCookieHandler");
        zdlpuopuiu.btonecajqb(ipAddressProvider, "ipAddressProvider");
        zdlpuopuiu.btonecajqb(merchantDataProvider, "merchantDataProvider");
        this.setCookieHandler = setCookieHandler;
        this.ipAddressProvider = ipAddressProvider;
        this.merchantDataProvider = merchantDataProvider;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0072 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // modern.payments.ecomAndroid.util.clearSdkUtil.ClearSdkUtil
    public Object clearSdkCache(lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        AnonymousClass1 anonymousClass1;
        ClearSdkUtilImpl clearSdkUtilImpl;
        MerchantDataProvider merchantDataProvider;
        if (gxszxtbevoVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) gxszxtbevoVar;
            int i13 = anonymousClass1.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i13 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(gxszxtbevoVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(gxszxtbevoVar);
        }
        Object obj = anonymousClass1.result;
        Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
        int i14 = anonymousClass1.label;
        if (i14 != 0) {
            if (i14 == 1) {
                clearSdkUtilImpl = (ClearSdkUtilImpl) anonymousClass1.L$0;
                gg.zdlpuopuiu.zoijcleaow(obj);
            } else if (i14 == 2) {
                clearSdkUtilImpl = (ClearSdkUtilImpl) anonymousClass1.L$0;
                gg.zdlpuopuiu.zoijcleaow(obj);
                merchantDataProvider = clearSdkUtilImpl.merchantDataProvider;
                anonymousClass1.L$0 = null;
                anonymousClass1.label = 3;
                if (merchantDataProvider.clearMerchantData(anonymousClass1) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(obj);
        SetCookieHandler setCookieHandler = this.setCookieHandler;
        anonymousClass1.L$0 = this;
        anonymousClass1.label = 1;
        if (setCookieHandler.clearSetCookieData(anonymousClass1) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        clearSdkUtilImpl = this;
        IpAddressProvider ipAddressProvider = clearSdkUtilImpl.ipAddressProvider;
        anonymousClass1.L$0 = clearSdkUtilImpl;
        anonymousClass1.label = 2;
        if (ipAddressProvider.clearIpAddress(anonymousClass1) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        merchantDataProvider = clearSdkUtilImpl.merchantDataProvider;
        anonymousClass1.L$0 = null;
        anonymousClass1.label = 3;
        if (merchantDataProvider.clearMerchantData(anonymousClass1) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
