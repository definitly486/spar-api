package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f45206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillingResult f45207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f45208c;

    public j(k kVar, BillingResult billingResult, List list) {
        this.f45206a = kVar;
        this.f45207b = billingResult;
        this.f45208c = list;
    }

    /* JADX WARN: Code duplicated, block: B:84:0x019a  */
    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        ProductInfo productInfo;
        String originalJson;
        String priceCurrencyCode;
        String originalJson2;
        k kVar = this.f45206a;
        BillingResult billingResult = this.f45207b;
        List<Purchase> list = this.f45208c;
        kVar.getClass();
        if (billingResult.getResponseCode() != 0) {
            kVar.f45214f.onUpdateFinished();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Purchase purchase : list) {
                Iterator it = purchase.getProducts().iterator();
                while (it.hasNext()) {
                    linkedHashMap.put((String) it.next(), purchase);
                }
            }
            List<PurchaseHistoryRecord> list2 = kVar.f45211c;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (PurchaseHistoryRecord purchaseHistoryRecord : list2) {
                Iterator it2 = purchaseHistoryRecord.getProducts().iterator();
                while (it2.hasNext()) {
                    linkedHashMap2.put((String) it2.next(), purchaseHistoryRecord);
                }
            }
            List<ProductDetails> list3 = kVar.f45212d;
            ArrayList arrayList = new ArrayList();
            for (ProductDetails productDetails : list3) {
                PurchaseHistoryRecord purchaseHistoryRecord2 = (PurchaseHistoryRecord) linkedHashMap2.get(productDetails.getProductId());
                if (purchaseHistoryRecord2 != null) {
                    Purchase purchase2 = (Purchase) linkedHashMap.get(productDetails.getProductId());
                    String productType = productDetails.getProductType();
                    int iHashCode = productType.hashCode();
                    if (iHashCode != 3541555) {
                        if (iHashCode == 100343516 && productType.equals("inapp")) {
                            String productType2 = productDetails.getProductType();
                            ProductType productType3 = zdlpuopuiu.eablkybsjg(productType2, "inapp") ? ProductType.INAPP : zdlpuopuiu.eablkybsjg(productType2, "subs") ? ProductType.SUBS : ProductType.UNKNOWN;
                            String productId = productDetails.getProductId();
                            int quantity = purchaseHistoryRecord2.getQuantity();
                            ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
                            long priceAmountMicros = oneTimePurchaseOfferDetails != null ? oneTimePurchaseOfferDetails.getPriceAmountMicros() : 0L;
                            ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2 = productDetails.getOneTimePurchaseOfferDetails();
                            if (oneTimePurchaseOfferDetails2 == null || (priceCurrencyCode = oneTimePurchaseOfferDetails2.getPriceCurrencyCode()) == null) {
                                priceCurrencyCode = "";
                            }
                            productInfo = new ProductInfo(productType3, productId, quantity, priceAmountMicros, priceCurrencyCode, 0L, null, 1, null, purchaseHistoryRecord2.getSignature(), purchaseHistoryRecord2.getPurchaseToken(), purchaseHistoryRecord2.getPurchaseTime(), purchase2 != null ? purchase2.isAutoRenewing() : false, (purchase2 == null || (originalJson2 = purchase2.getOriginalJson()) == null) ? "{}" : originalJson2);
                        } else {
                            productInfo = null;
                        }
                    } else if (productType.equals("subs")) {
                        String productType4 = productDetails.getProductType();
                        productInfo = new ProductInfo(zdlpuopuiu.eablkybsjg(productType4, "inapp") ? ProductType.INAPP : zdlpuopuiu.eablkybsjg(productType4, "subs") ? ProductType.SUBS : ProductType.UNKNOWN, productDetails.getProductId(), purchaseHistoryRecord2.getQuantity(), 0L, "", 0L, null, 1, null, purchaseHistoryRecord2.getSignature(), purchaseHistoryRecord2.getPurchaseToken(), purchaseHistoryRecord2.getPurchaseTime(), purchase2 != null ? purchase2.isAutoRenewing() : false, (purchase2 == null || (originalJson = purchase2.getOriginalJson()) == null) ? "{}" : originalJson);
                    } else {
                        productInfo = null;
                    }
                } else {
                    productInfo = null;
                }
                if (productInfo != null) {
                    arrayList.add(productInfo);
                }
            }
            kVar.f45209a.getBillingInfoSender().sendInfo(arrayList);
            kVar.f45210b.invoke();
            kVar.f45214f.onUpdateFinished();
        }
        k kVar2 = this.f45206a;
        kVar2.f45213e.a(kVar2);
    }
}
