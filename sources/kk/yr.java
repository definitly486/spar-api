package kk;

import androidx.appcompat.widget.AppCompatImageView;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class yr implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ npi.spay.kd f59473yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ jy f59474zdlpuopuiu;

    public yr(jy jyVar, npi.spay.kd kdVar) {
        this.f59474zdlpuopuiu = jyVar;
        this.f59473yggfygwlhe = kdVar;
    }

    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        ListOfCardsResponseBody.PromoInfo.BannerData bannerData = (ListOfCardsResponseBody.PromoInfo.BannerData) obj;
        this.f59474zdlpuopuiu.f57234ppxfxbqfkf.setText(bannerData.getText());
        String iconUrl = bannerData.getIconUrl();
        if (iconUrl != null && iconUrl.length() != 0) {
            AppCompatImageView targetView = this.f59474zdlpuopuiu.f57236zoijcleaow;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(targetView, "spayLnmcAcivImage");
            df dfVar = this.f59473yggfygwlhe.f70576iwizpuwonk;
            if (dfVar == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("coilImpl");
                dfVar = null;
            }
            String iconUrl2 = bannerData.getIconUrl();
            o20 imageRequestListener = new o20();
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(targetView, "<this>");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(imageRequestListener, "imageRequestListener");
            if (dfVar != null) {
                u30 imageRequestBuilder = new u30(imageRequestListener);
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(targetView, "targetView");
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(imageRequestBuilder, "imageRequestBuilder");
                e7.nufgyqmvbu.iobyxmoadg iobyxmoadgVarBtonecajqb = new e7.nufgyqmvbu.iobyxmoadg(dfVar.f56266iobyxmoadg).zoijcleaow(iconUrl2).btonecajqb(targetView);
                imageRequestBuilder.invoke(iobyxmoadgVarBtonecajqb);
                dfVar.f56267zoijcleaow.iobyxmoadg(iobyxmoadgVarBtonecajqb.iobyxmoadg());
            }
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
