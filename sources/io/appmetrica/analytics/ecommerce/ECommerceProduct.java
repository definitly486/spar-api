package io.appmetrica.analytics.ecommerce;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ECommerceProduct {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f45381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f45382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f45383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ECommercePrice f45384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ECommercePrice f45385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List f45386g;

    public ECommerceProduct(String str) {
        this.f45380a = str;
    }

    public ECommercePrice getActualPrice() {
        return this.f45384e;
    }

    public List<String> getCategoriesPath() {
        return this.f45382c;
    }

    public String getName() {
        return this.f45381b;
    }

    public ECommercePrice getOriginalPrice() {
        return this.f45385f;
    }

    public Map<String, String> getPayload() {
        return this.f45383d;
    }

    public List<String> getPromocodes() {
        return this.f45386g;
    }

    public String getSku() {
        return this.f45380a;
    }

    public ECommerceProduct setActualPrice(ECommercePrice eCommercePrice) {
        this.f45384e = eCommercePrice;
        return this;
    }

    public ECommerceProduct setCategoriesPath(List<String> list) {
        this.f45382c = list;
        return this;
    }

    public ECommerceProduct setName(String str) {
        this.f45381b = str;
        return this;
    }

    public ECommerceProduct setOriginalPrice(ECommercePrice eCommercePrice) {
        this.f45385f = eCommercePrice;
        return this;
    }

    public ECommerceProduct setPayload(Map<String, String> map) {
        this.f45383d = map;
        return this;
    }

    public ECommerceProduct setPromocodes(List<String> list) {
        this.f45386g = list;
        return this;
    }

    public String toString() {
        return "ECommerceProduct{sku='" + this.f45380a + "', name='" + this.f45381b + "', categoriesPath=" + this.f45382c + ", payload=" + this.f45383d + ", actualPrice=" + this.f45384e + ", originalPrice=" + this.f45385f + ", promocodes=" + this.f45386g + '}';
    }
}
