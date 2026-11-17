package id1;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import ow1.esjtqupxsv;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final esjtqupxsv f42431ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final sc1.ppxfxbqfkf f42432zoijcleaow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(sc1.ppxfxbqfkf mySparDialogsRepository, esjtqupxsv isAuthUseCase, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(mySparDialogsRepository, "mySparDialogsRepository");
        zdlpuopuiu.btonecajqb(isAuthUseCase, "isAuthUseCase");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f42432zoijcleaow = mySparDialogsRepository;
        this.f42431ppxfxbqfkf = isAuthUseCase;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (((Boolean) this.f42431ppxfxbqfkf.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
            return this.f42432zoijcleaow.zoijcleaow(gxszxtbevoVar);
        }
        return null;
    }
}
