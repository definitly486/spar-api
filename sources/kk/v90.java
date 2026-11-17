package kk;

import android.content.Context;
import spay.sdk.api.SPayMethod;
import spay.sdk.api.model.SPaymentRequest;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v90 {
    public static void iobyxmoadg(spay.sdk.c cVar, Context context, String apiKey, String merchantLogin, String bankInvoiceId, String orderNumber, String appPackage, tg.draadjrbmk callback) {
        cVar.getClass();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(apiKey, "apiKey");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(merchantLogin, "merchantLogin");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bankInvoiceId, "bankInvoiceId");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(appPackage, "appPackage");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb("", "phoneNumber");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(callback, "callback");
        cVar.a(SPayMethod.WithBonuses.INSTANCE, new SPaymentRequest(context, apiKey, bankInvoiceId, orderNumber, merchantLogin, appPackage, "", callback));
    }
}
