package com.bumptech.glide;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.legacy.presentation.util.GlideModule;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/bumptech/glide/GeneratedAppGlideModuleImpl;", "Lcom/bumptech/glide/GeneratedAppGlideModule;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/bumptech/glide/zoijcleaow;", "glide", "Lcom/bumptech/glide/Registry;", "registry", "Lgg/wwaezpbzkn;", "iobyxmoadg", "(Landroid/content/Context;Lcom/bumptech/glide/zoijcleaow;Lcom/bumptech/glide/Registry;)V", "Lcom/bumptech/glide/ppxfxbqfkf;", "builder", "zoijcleaow", "(Landroid/content/Context;Lcom/bumptech/glide/ppxfxbqfkf;)V", "", "ppxfxbqfkf", "()Z", "Lru/myspar/proloyalty/legacy/presentation/util/GlideModule;", "Lru/myspar/proloyalty/legacy/presentation/util/GlideModule;", "appGlideModule", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final /* synthetic */ int f20586zoijcleaow = 0;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name and from kotlin metadata */
    private final GlideModule appGlideModule;

    public GeneratedAppGlideModuleImpl(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        this.appGlideModule = new GlideModule();
    }

    @Override // a9.ppxfxbqfkf
    public void iobyxmoadg(Context context, zoijcleaow glide, Registry registry) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(glide, "glide");
        zdlpuopuiu.btonecajqb(registry, "registry");
        new u6.wkgbmnqykc().iobyxmoadg(context, glide, registry);
        this.appGlideModule.iobyxmoadg(context, glide, registry);
    }

    @Override // a9.iobyxmoadg
    public boolean ppxfxbqfkf() {
        return false;
    }

    @Override // a9.iobyxmoadg
    public void zoijcleaow(Context context, ppxfxbqfkf builder) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(builder, "builder");
        this.appGlideModule.zoijcleaow(context, builder);
    }
}
