package io.appmetrica.analytics.ecommerce;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ECommerceScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f45390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f45391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f45392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f45393d;

    public List<String> getCategoriesPath() {
        return this.f45391b;
    }

    public String getName() {
        return this.f45390a;
    }

    public Map<String, String> getPayload() {
        return this.f45393d;
    }

    public String getSearchQuery() {
        return this.f45392c;
    }

    public ECommerceScreen setCategoriesPath(List<String> list) {
        this.f45391b = list;
        return this;
    }

    public ECommerceScreen setName(String str) {
        this.f45390a = str;
        return this;
    }

    public ECommerceScreen setPayload(Map<String, String> map) {
        this.f45393d = map;
        return this;
    }

    public ECommerceScreen setSearchQuery(String str) {
        this.f45392c = str;
        return this;
    }

    public String toString() {
        return "ECommerceScreen{name='" + this.f45390a + "', categoriesPath=" + this.f45391b + ", searchQuery='" + this.f45392c + "', payload=" + this.f45393d + '}';
    }
}
