package io.appmetrica.analytics.networktasks.internal;

import android.net.Uri;
import io.appmetrica.analytics.networktasks.impl.c;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class FullUrlFormer<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f48830a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f48831b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f48832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IParamsAppender f48833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ConfigProvider f48834e;

    public FullUrlFormer(IParamsAppender<T> iParamsAppender, ConfigProvider<T> configProvider) {
        this.f48833d = iParamsAppender;
        this.f48834e = configProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void buildAndSetFullHostUrl() {
        Uri.Builder builderBuildUpon = Uri.parse((String) this.f48830a.get(this.f48831b)).buildUpon();
        this.f48833d.appendParams(builderBuildUpon, this.f48834e.getConfig());
        this.f48832c = builderBuildUpon.build().toString();
    }

    public List<String> getAllHosts() {
        return this.f48830a;
    }

    public String getUrl() {
        return new c(this.f48832c).f48805a;
    }

    public boolean hasMoreHosts() {
        return this.f48831b + 1 < this.f48830a.size();
    }

    public void incrementAttemptNumber() {
        this.f48831b++;
    }

    public void setHosts(List<String> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f48830a = list;
    }
}
