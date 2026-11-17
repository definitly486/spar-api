package kk;

import kotlin.NoWhenBranchMatchedException;
import modern.payments.ecomAndroid.util.interceptor.impl.HostSelectionInterceptorImpl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e00 {
    public static String iobyxmoadg() {
        switch (lq.iobyxmoadg(ag.f55814zoijcleaow)) {
            case 0:
                return HostSelectionInterceptorImpl.PROD_URL;
            case 1:
                return HostSelectionInterceptorImpl.PSI_URL;
            case 2:
                return HostSelectionInterceptorImpl.IFT_URL;
            case 3:
                return "https://api.mocki.io/v2/071c7c55/";
            case 4:
                return HostSelectionInterceptorImpl.IFT_URL;
            case 5:
            case 6:
                return HostSelectionInterceptorImpl.SANDBOX_URL;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
