package cw;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import modern.payments.ecomAndroid.util.interceptor.impl.HostSelectionInterceptorImpl;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements rgvfuqvkyq {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final C0457iobyxmoadg f25968yggfygwlhe = new C0457iobyxmoadg(null);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Context f25969zdlpuopuiu;

    /* JADX INFO: renamed from: cw.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0457iobyxmoadg {
        public /* synthetic */ C0457iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C0457iobyxmoadg() {
        }
    }

    public iobyxmoadg(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        this.f25969zdlpuopuiu = context;
    }

    @Override // tg.rgvfuqvkyq
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public String invoke(String bankScheme, String sbpUrl) {
        zdlpuopuiu.btonecajqb(bankScheme, "bankScheme");
        zdlpuopuiu.btonecajqb(sbpUrl, "sbpUrl");
        String strHcddaimhww = kcexrzcfyt.hcddaimhww(sbpUrl, HostSelectionInterceptorImpl.PROTOCOL_HTTPS, "bank" + bankScheme, false, 4, null);
        if (new Intent("android.intent.action.VIEW", Uri.parse(strHcddaimhww)).resolveActivity(this.f25969zdlpuopuiu.getPackageManager()) != null) {
            return strHcddaimhww;
        }
        return null;
    }
}
