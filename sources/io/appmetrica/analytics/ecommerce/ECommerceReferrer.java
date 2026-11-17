package io.appmetrica.analytics.ecommerce;

/* JADX INFO: loaded from: classes3.dex */
public class ECommerceReferrer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f45387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f45388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ECommerceScreen f45389c;

    public String getIdentifier() {
        return this.f45388b;
    }

    public ECommerceScreen getScreen() {
        return this.f45389c;
    }

    public String getType() {
        return this.f45387a;
    }

    public ECommerceReferrer setIdentifier(String str) {
        this.f45388b = str;
        return this;
    }

    public ECommerceReferrer setScreen(ECommerceScreen eCommerceScreen) {
        this.f45389c = eCommerceScreen;
        return this;
    }

    public ECommerceReferrer setType(String str) {
        this.f45387a = str;
        return this;
    }

    public String toString() {
        return "ECommerceReferrer{type='" + this.f45387a + "', identifier='" + this.f45388b + "', screen=" + this.f45389c + '}';
    }
}
