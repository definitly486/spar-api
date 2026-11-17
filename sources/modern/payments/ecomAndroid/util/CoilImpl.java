package modern.payments.ecomAndroid.util;

import android.content.Context;
import android.widget.ImageView;
import bl.gxszxtbevo;
import e7.eablkybsjg;
import e7.nufgyqmvbu;
import gg.wwaezpbzkn;
import kotlin.Metadata;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;
import v6.wkgbmnqykc;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\u0010\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u0010\u0010\u0011J=\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017¨\u0006\u0018"}, d2 = {"Lmodern/payments/ecomAndroid/util/CoilImpl;", "", "Landroid/content/Context;", "context", "Lv6/wkgbmnqykc;", "imageLoader", "<init>", "(Landroid/content/Context;Lv6/wkgbmnqykc;)V", "data", "Landroid/widget/ImageView;", "targetView", "Lkotlin/Function1;", "Le7/nufgyqmvbu$iobyxmoadg;", "Lgg/wwaezpbzkn;", "imageRequestBuilder", "Le7/eablkybsjg;", "loadImage", "(Ljava/lang/Object;Landroid/widget/ImageView;Ltg/draadjrbmk;)Le7/eablkybsjg;", "", "base64", "convertBase64ToSvg", "(Ljava/lang/String;Landroid/widget/ImageView;Lv6/wkgbmnqykc;Ltg/draadjrbmk;)Le7/eablkybsjg;", "Landroid/content/Context;", "Lv6/wkgbmnqykc;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CoilImpl {
    private final Context context;
    private final wkgbmnqykc imageLoader;

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.util.CoilImpl$convertBase64ToSvg$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le7/nufgyqmvbu$iobyxmoadg;", "Lgg/wwaezpbzkn;", "invoke", "(Le7/nufgyqmvbu$iobyxmoadg;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    static final class AnonymousClass1 extends jyumaefscl implements draadjrbmk {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        public final void invoke(nufgyqmvbu.iobyxmoadg iobyxmoadgVar) {
            zdlpuopuiu.btonecajqb(iobyxmoadgVar, "$this$null");
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((nufgyqmvbu.iobyxmoadg) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: modern.payments.ecomAndroid.util.CoilImpl$loadImage$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le7/nufgyqmvbu$iobyxmoadg;", "Lgg/wwaezpbzkn;", "invoke", "(Le7/nufgyqmvbu$iobyxmoadg;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class C40901 extends jyumaefscl implements draadjrbmk {
        public static final C40901 INSTANCE = new C40901();

        C40901() {
            super(1);
        }

        public final void invoke(nufgyqmvbu.iobyxmoadg iobyxmoadgVar) {
            zdlpuopuiu.btonecajqb(iobyxmoadgVar, "$this$null");
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((nufgyqmvbu.iobyxmoadg) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public CoilImpl(Context context, wkgbmnqykc imageLoader) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(imageLoader, "imageLoader");
        this.context = context;
        this.imageLoader = imageLoader;
    }

    public static /* synthetic */ eablkybsjg convertBase64ToSvg$default(CoilImpl coilImpl, String str, ImageView imageView, wkgbmnqykc wkgbmnqykcVar, draadjrbmk draadjrbmkVar, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            draadjrbmkVar = AnonymousClass1.INSTANCE;
        }
        return coilImpl.convertBase64ToSvg(str, imageView, wkgbmnqykcVar, draadjrbmkVar);
    }

    public static /* synthetic */ eablkybsjg loadImage$default(CoilImpl coilImpl, Object obj, ImageView imageView, draadjrbmk draadjrbmkVar, int i13, Object obj2) {
        if ((i13 & 4) != 0) {
            draadjrbmkVar = C40901.INSTANCE;
        }
        return coilImpl.loadImage(obj, imageView, draadjrbmkVar);
    }

    public final eablkybsjg convertBase64ToSvg(String base64, ImageView targetView, wkgbmnqykc imageLoader, draadjrbmk imageRequestBuilder) {
        gxszxtbevo gxszxtbevoVarIobyxmoadg;
        zdlpuopuiu.btonecajqb(targetView, "targetView");
        zdlpuopuiu.btonecajqb(imageLoader, "imageLoader");
        zdlpuopuiu.btonecajqb(imageRequestBuilder, "imageRequestBuilder");
        return loadImage((base64 == null || (gxszxtbevoVarIobyxmoadg = gxszxtbevo.f16674iwizpuwonk.iobyxmoadg(base64)) == null) ? null : gxszxtbevoVarIobyxmoadg.iobyxmoadg(), targetView, imageRequestBuilder);
    }

    public final eablkybsjg loadImage(Object data, ImageView targetView, draadjrbmk imageRequestBuilder) {
        zdlpuopuiu.btonecajqb(targetView, "targetView");
        zdlpuopuiu.btonecajqb(imageRequestBuilder, "imageRequestBuilder");
        nufgyqmvbu.iobyxmoadg iobyxmoadgVarBtonecajqb = new nufgyqmvbu.iobyxmoadg(this.context).zoijcleaow(data).btonecajqb(targetView);
        imageRequestBuilder.invoke(iobyxmoadgVarBtonecajqb);
        return this.imageLoader.iobyxmoadg(iobyxmoadgVarBtonecajqb.iobyxmoadg());
    }
}
