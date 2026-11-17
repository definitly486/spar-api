package modern.payments.ecomAndroid.util.extension;

import android.widget.ImageView;
import e7.eablkybsjg;
import e7.gxszxtbevo;
import e7.nufgyqmvbu;
import e7.rgvfuqvkyq;
import gg.wwaezpbzkn;
import kotlin.Metadata;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.CoilImpl;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\r\u001a\u00020\f*\u00020\u00002\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroid/widget/ImageView;", "Lmodern/payments/ecomAndroid/util/CoilImpl;", "coilImpl", "", "imageUrl", "Le7/nufgyqmvbu$zoijcleaow;", "imageRequestListener", "Le7/eablkybsjg;", "loadImageAsync", "(Landroid/widget/ImageView;Lmodern/payments/ecomAndroid/util/CoilImpl;Ljava/lang/String;Le7/nufgyqmvbu$zoijcleaow;)Le7/eablkybsjg;", "", "resourceId", "Lgg/wwaezpbzkn;", "setDrawable", "(Landroid/widget/ImageView;I)V", "ecomAndroid_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ImageViewExtensionsKt {

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.util.extension.ImageViewExtensionsKt$loadImageAsync$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le7/nufgyqmvbu$iobyxmoadg;", "Lgg/wwaezpbzkn;", "invoke", "(Le7/nufgyqmvbu$iobyxmoadg;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    static final class AnonymousClass2 extends jyumaefscl implements draadjrbmk {
        final /* synthetic */ nufgyqmvbu.zoijcleaow $imageRequestListener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(nufgyqmvbu.zoijcleaow zoijcleaowVar) {
            super(1);
            this.$imageRequestListener = zoijcleaowVar;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((nufgyqmvbu.iobyxmoadg) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void invoke(nufgyqmvbu.iobyxmoadg loadImage) {
            zdlpuopuiu.btonecajqb(loadImage, "$this$loadImage");
            loadImage.wkgbmnqykc(this.$imageRequestListener);
        }
    }

    public static final eablkybsjg loadImageAsync(ImageView imageView, CoilImpl coilImpl, String str, nufgyqmvbu.zoijcleaow imageRequestListener) {
        zdlpuopuiu.btonecajqb(imageView, "<this>");
        zdlpuopuiu.btonecajqb(imageRequestListener, "imageRequestListener");
        if (coilImpl != null) {
            return coilImpl.loadImage(str, imageView, new AnonymousClass2(imageRequestListener));
        }
        return null;
    }

    public static /* synthetic */ eablkybsjg loadImageAsync$default(ImageView imageView, CoilImpl coilImpl, String str, nufgyqmvbu.zoijcleaow zoijcleaowVar, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            zoijcleaowVar = new nufgyqmvbu.zoijcleaow() { // from class: modern.payments.ecomAndroid.util.extension.ImageViewExtensionsKt.loadImageAsync.1
                @Override // e7.nufgyqmvbu.zoijcleaow
                public /* bridge */ /* synthetic */ void onCancel(nufgyqmvbu nufgyqmvbuVar) {
                    super.onCancel(nufgyqmvbuVar);
                }

                @Override // e7.nufgyqmvbu.zoijcleaow
                public /* bridge */ /* synthetic */ void onError(nufgyqmvbu nufgyqmvbuVar, gxszxtbevo gxszxtbevoVar) {
                    super.onError(nufgyqmvbuVar, gxszxtbevoVar);
                }

                @Override // e7.nufgyqmvbu.zoijcleaow
                public /* bridge */ /* synthetic */ void onStart(nufgyqmvbu nufgyqmvbuVar) {
                    super.onStart(nufgyqmvbuVar);
                }

                @Override // e7.nufgyqmvbu.zoijcleaow
                public /* bridge */ /* synthetic */ void onSuccess(nufgyqmvbu nufgyqmvbuVar, rgvfuqvkyq rgvfuqvkyqVar) {
                    super.onSuccess(nufgyqmvbuVar, rgvfuqvkyqVar);
                }
            };
        }
        return loadImageAsync(imageView, coilImpl, str, zoijcleaowVar);
    }

    public static final void setDrawable(ImageView imageView, int i13) {
        zdlpuopuiu.btonecajqb(imageView, "<this>");
        imageView.setImageDrawable(i1.nufgyqmvbu.gxszxtbevo(imageView.getResources(), i13, null));
    }
}
