package spay.sdk.view;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import bl.gxszxtbevo;
import e7.nufgyqmvbu;
import gg.eablkybsjg;
import gg.vdvldrhtss;
import java.nio.ByteBuffer;
import kk.bq;
import kk.bt;
import kk.df;
import kk.mp;
import kk.ow;
import kk.r80;
import kk.tk;
import kk.v90;
import kk.we0;
import kk.xc;
import kk.xr;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import spay.sdk.R;
import spay.sdk.RedirectActivity;
import spay.sdk.SPaySdkApp;
import spay.sdk.api.PaymentResult;
import spay.sdk.c;
import spay.sdk.view.SPayButton;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\r2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0016\u001a\u00020\n2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\n0\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017JW\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00102\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\n0\u0013H\u0007¢\u0006\u0004\b\u001f\u0010 JW\u0010#\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00102\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\n0\u0013H\u0007¢\u0006\u0004\b#\u0010 J\u0017\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u001eH\u0007¢\u0006\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lspay/sdk/view/SPayButton;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "dpRadius", "Lgg/wwaezpbzkn;", "setCornerRadius", "(I)V", "Lgg/vdvldrhtss;", "", "", "", "checkPermissions", "(Landroid/content/Context;)Lgg/vdvldrhtss;", "Lkotlin/Function1;", "Lspay/sdk/api/SdkReadyCheckResult;", "callback", "isReadyForSPaySdk", "(Ltg/draadjrbmk;)V", "authorization", "merchantLogin", "orderId", "orderNumber", "appPackage", "language", "Lspay/sdk/api/PaymentResult;", "payWithOrderId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltg/draadjrbmk;)V", "apiKey", "bankInvoiceId", "payWithBankInvoiceId", "paymentResult", "completePayment", "(Lspay/sdk/api/PaymentResult;)V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SPayButton extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f107866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final df f107867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f107868c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SPayButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        zdlpuopuiu.btonecajqb(context, "context");
        View viewInflate = View.inflate(context, R.layout.spay_button, this);
        zdlpuopuiu.dxjokdxxww(viewInflate, "inflate(context, R.layout.spay_button, this)");
        this.f107866a = viewInflate;
        SPaySdkApp.Companion companion = SPaySdkApp.INSTANCE;
        bq sdkComponent = companion.getInstance().getSdkComponent();
        this.f107867b = sdkComponent != null ? ((tk) sdkComponent).iobyxmoadg() : null;
        bq sdkComponent2 = companion.getInstance().getSdkComponent();
        bt btVarZoijcleaow = sdkComponent2 != null ? ((tk) sdkComponent2).zoijcleaow() : null;
        this.f107868c = "PHN2ZyB3aWR0aD0iNDgiIGhlaWdodD0iMTgiIHZpZXdCb3g9IjAgMCA0OCAxOCIgZmlsbD0ibm9uZSIgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvc3ZnIj4KPHBhdGggZD0iTTI0LjkzMDMgMTAuNDQ5OVYxMy45MTUxSDIyLjk4MjdWMi43OTA3MUgyNi42MDk4QzMwLjA1MTUgMi43OTA3MSAzMS41MTQxIDQuMDQ2OTMgMzEuNTE0MSA2LjU1Njg4QzMxLjUxNDEgOS4xNDY0MyAyOS44MDA1IDEwLjQ0OTkgMjYuNjA5OCAxMC40NDk5SDI0LjkzMDNaTTI0LjkzMDMgNC42MTkwN1Y4LjYyNDA0SDI2Ljc1MTFDMjguNTU3MyA4LjYyNDA0IDI5LjQ5MDkgOC4wMTk1NyAyOS40OTA5IDYuNTA5NjJDMjkuNDkwOSA1LjE0Mzk0IDI4LjY4MTcgNC42MTkwNyAyNi43ODA0IDQuNjE5MDdIMjQuOTMwM1oiIGZpbGw9IndoaXRlIi8+CjxwYXRoIGQ9Ik0zMi41NDIxIDYuNTIzNzhDMzMuMDU2NCA2LjEyNTc3IDMzLjk5IDUuODA5ODUgMzUuMzMwNiA1LjgwOTg1QzM3LjYwNDggNS44MDk4NSAzOC43MjYxIDYuNjAzMzggMzguNzI2MSA4LjY3MDU1VjEzLjkxNDNIMzcuMDEyNVYxMi40ODRDMzYuNjM5NiAxMy40MDY5IDM1LjY4ODkgMTQuMDQxMiAzNC40NDMzIDE0LjA0MTJDMzIuODcxMSAxNC4wNDEyIDMxLjkzNTEgMTMuMTM1NyAzMS45MzUxIDExLjU3ODVDMzEuOTM1MSA5Ljc2NzU2IDMzLjIyNyA5LjI1NzYxIDM1LjE0MjkgOS4yNTc2MUgzNi45MDI4VjguOTA2ODZDMzYuOTAyOCA3Ljc3NzUxIDM2LjM3MzkgNy40MjkyNSAzNS4zMzA2IDcuNDI5MjVDMzMuODk3MyA3LjQyOTI1IDMzLjA3MzQgOC4wMDEzOSAzMi41NDIxIDguODQ0NjdWNi41MjM3OFpNMzYuOTAyOCAxMS4xMTgzVjEwLjQ2NjZIMzUuMzYyM0MzNC4yODczIDEwLjQ2NjYgMzMuNzczIDEwLjY3MyAzMy43NzMgMTEuMzg5NEMzMy43NzMgMTEuOTkzOSAzNC4yMDkzIDEyLjM3NDUgMzUuMDE4NiAxMi4zNzQ1QzM2LjI0OTYgMTIuMzcyIDM2LjgyNDggMTEuNjU4MSAzNi45MDI4IDExLjExODNaIiBmaWxsPSJ3aGl0ZSIvPgo8cGF0aCBkPSJNMzkuNjI4NCA1Ljk2OTc2SDQxLjY2ODZMNDMuODAxNCAxMS40Mkw0NS41NDQyIDUuOTY5NzZINDcuNDc0N0w0NC4zNTk2IDE0Ljc1ODNDNDMuNjc0NyAxNi42NjYzIDQyLjk3MjcgMTcuMDk0MSA0MS45NDY1IDE3LjA5NDFDNDEuNDYzOCAxNy4wOTQxIDQwLjkzNDkgMTYuOTUyMyA0MC43MDA5IDE2Ljc0MzRWMTUuMDEyQzQwLjkzNDkgMTUuMjUwOCA0MS4yOTMyIDE1LjQxIDQxLjYzNDUgMTUuNDFDNDIuMTk1MSAxNS40MSA0Mi42MTQzIDE1LjAyOTQgNDIuOTExNyAxMy45NDc0TDM5LjYyODQgNS45Njk3NloiIGZpbGw9IndoaXRlIi8+CjxwYXRoIGQ9Ik01LjE1OTY3IDYuNTMyODlWOC45NzMxOUw4LjMzMDg4IDExLjAwMDVMMTUuOTE4OSA1LjI5NDA4QzE1LjY1MDcgNC42ODk2MSAxNS4zMTQ0IDQuMTI0OTMgMTQuOTE5NSAzLjYwNTAzTDguMzMwODggOC41NjAyNUw1LjE1OTY3IDYuNTMyODlaIiBmaWxsPSJ3aGl0ZSIvPgo8cGF0aCBkPSJNMTQuNzMyMyA4LjYyMzE5QzE0LjczNDggOC42ODA0IDE0LjczNDggOC43NDAxIDE0LjczNDggOC43OTczMkMxNC43MzQ4IDEyLjQwMTggMTEuODYwOSAxNS4zMzIxIDguMzMxNDIgMTUuMzMyMUM0LjgwMTkgMTUuMzMyMSAxLjkyNTY0IDEyLjQwMTggMS45MjU2NCA4Ljc5NzMyQzEuOTI1NjQgNS4xOTI4NCA0Ljc5OTQ2IDIuMjYyNDkgOC4zMjg5OCAyLjI2MjQ5QzkuNjY3MTggMi4yNjI0OSAxMC45MTAzIDIuNjgyODkgMTEuOTM4OSAzLjQwNDI4TDEzLjU1NzQgMi4xODUzOEMxMi4xMjkxIDEuMDA2MjcgMTAuMzA4MiAwLjI5OTgwNSA4LjMyNjU1IDAuMjk5ODA1QzMuNzI2OTYgMC4yOTk4MDUgMCA0LjEwNTc4IDAgOC43OTk4QzAgMTMuNDkzOCAzLjcyOTQgMTcuMjk5OCA4LjMyNjU1IDE3LjI5OThDMTIuOTI2MSAxNy4yOTk4IDE2LjY1MzEgMTMuNDkzOCAxNi42NTMxIDguNzk5OEMxNi42NTMxIDguMjc5OSAxNi42MDY4IDcuNzY5OTUgMTYuNTE5IDcuMjc3NDJMMTQuNzMyMyA4LjYyMzE5WiIgZmlsbD0id2hpdGUiLz4KPC9zdmc+Cg==";
        a();
        if (btVarZoijcleaow != null) {
            btVarZoijcleaow.iobyxmoadg(new ow(xr.LC_PAY_BUTTON_INITED, we0.MERCHANT_VIEW, mp.LC, null, null, null, null, 120));
        }
    }

    public final void a() {
        gxszxtbevo gxszxtbevoVarIobyxmoadg;
        CardView cardView = (CardView) this.f107866a.findViewById(R.id.f6spay_v_btn_pay);
        AppCompatImageView targetView = (AppCompatImageView) this.f107866a.findViewById(R.id.spay_aciv_bank_logo_clear);
        df dfVar = this.f107867b;
        if (dfVar != null) {
            String str = this.f107868c;
            zdlpuopuiu.dxjokdxxww(targetView, "acivBankLogoClear");
            xc imageRequestBuilder = xc.f59295zdlpuopuiu;
            zdlpuopuiu.btonecajqb(targetView, "targetView");
            zdlpuopuiu.btonecajqb(imageRequestBuilder, "imageRequestBuilder");
            ByteBuffer byteBufferIobyxmoadg = (str == null || (gxszxtbevoVarIobyxmoadg = gxszxtbevo.f16674iwizpuwonk.iobyxmoadg(str)) == null) ? null : gxszxtbevoVarIobyxmoadg.iobyxmoadg();
            zdlpuopuiu.btonecajqb(targetView, "targetView");
            zdlpuopuiu.btonecajqb(imageRequestBuilder, "imageRequestBuilder");
            nufgyqmvbu.iobyxmoadg iobyxmoadgVarBtonecajqb = new nufgyqmvbu.iobyxmoadg(dfVar.f56266iobyxmoadg).zoijcleaow(byteBufferIobyxmoadg).btonecajqb(targetView);
            imageRequestBuilder.invoke(iobyxmoadgVarBtonecajqb);
            dfVar.f56267zoijcleaow.iobyxmoadg(iobyxmoadgVarBtonecajqb.iobyxmoadg());
        }
        cardView.setOnClickListener(new View.OnClickListener() { // from class: hc2.iobyxmoadg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SPayButton.a(this.f40057zdlpuopuiu, view);
            }
        });
    }

    public final vdvldrhtss checkPermissions(Context context) {
        c cVarIobyxmoadg;
        zdlpuopuiu.btonecajqb(context, "context");
        synchronized (r80.f58283iobyxmoadg) {
            cVarIobyxmoadg = c.f107839f.iobyxmoadg();
        }
        return cVarIobyxmoadg.a(context);
    }

    @eablkybsjg
    public final void completePayment(PaymentResult paymentResult) {
        c cVarIobyxmoadg;
        zdlpuopuiu.btonecajqb(paymentResult, "paymentResult");
        synchronized (r80.f58283iobyxmoadg) {
            cVarIobyxmoadg = c.f107839f.iobyxmoadg();
        }
        Context context = getContext();
        zdlpuopuiu.dxjokdxxww(context, "context");
        cVarIobyxmoadg.getClass();
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(paymentResult, "paymentResult");
        context.startActivity(new Intent(context, (Class<?>) RedirectActivity.class).putExtra("PAYMENT_RESULT", paymentResult));
    }

    @eablkybsjg
    public final void isReadyForSPaySdk(draadjrbmk callback) {
        c cVarIobyxmoadg;
        zdlpuopuiu.btonecajqb(callback, "callback");
        synchronized (r80.f58283iobyxmoadg) {
            cVarIobyxmoadg = c.f107839f.iobyxmoadg();
        }
        Context context = getContext();
        zdlpuopuiu.dxjokdxxww(context, "context");
        cVarIobyxmoadg.a(context, callback);
    }

    @eablkybsjg
    public final void payWithBankInvoiceId(String apiKey, String merchantLogin, String bankInvoiceId, String orderNumber, String appPackage, String language, draadjrbmk callback) {
        c cVarIobyxmoadg;
        zdlpuopuiu.btonecajqb(apiKey, "apiKey");
        zdlpuopuiu.btonecajqb(merchantLogin, "merchantLogin");
        zdlpuopuiu.btonecajqb(bankInvoiceId, "bankInvoiceId");
        zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
        zdlpuopuiu.btonecajqb(appPackage, "appPackage");
        zdlpuopuiu.btonecajqb(callback, "callback");
        synchronized (r80.f58283iobyxmoadg) {
            cVarIobyxmoadg = c.f107839f.iobyxmoadg();
        }
        Context context = getContext();
        zdlpuopuiu.dxjokdxxww(context, "context");
        v90.iobyxmoadg(cVarIobyxmoadg, context, apiKey, merchantLogin, bankInvoiceId, orderNumber, appPackage, callback);
    }

    @eablkybsjg
    public final void payWithOrderId(String authorization, String merchantLogin, String orderId, String orderNumber, String appPackage, String language, draadjrbmk callback) {
        c cVarIobyxmoadg;
        zdlpuopuiu.btonecajqb(authorization, "authorization");
        zdlpuopuiu.btonecajqb(merchantLogin, "merchantLogin");
        zdlpuopuiu.btonecajqb(orderId, "orderId");
        zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
        zdlpuopuiu.btonecajqb(appPackage, "appPackage");
        zdlpuopuiu.btonecajqb(callback, "callback");
        synchronized (r80.f58283iobyxmoadg) {
            cVarIobyxmoadg = c.f107839f.iobyxmoadg();
        }
        Context context = getContext();
        zdlpuopuiu.dxjokdxxww(context, "context");
        v90.iobyxmoadg(cVarIobyxmoadg, context, authorization, merchantLogin, orderId, orderNumber, appPackage, callback);
    }

    public final void setCornerRadius(int dpRadius) {
        ((CardView) this.f107866a.findViewById(R.id.f6spay_v_btn_pay)).setRadius((int) (dpRadius * Resources.getSystem().getDisplayMetrics().density));
    }

    public static final void a(SPayButton this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        this$0.performClick();
    }
}
