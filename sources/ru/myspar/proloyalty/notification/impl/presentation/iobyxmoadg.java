package ru.myspar.proloyalty.notification.impl.presentation;

import androidx.lifecycle.pkzmftpjix;
import gg.cqumvgiudr;
import gg.vdvldrhtss;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import hg.tzroggbefp;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.proloyalty.notification.impl.presentation.store.State;
import ru.myspar.proloyalty.notification.impl.presentation.store.eablkybsjg;
import ru.myspar.proloyalty.notification.impl.presentation.store.lqeggnwhkg;
import tg.draadjrbmk;
import zg.gtknphoqwx;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final if1.iobyxmoadg f98500btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f98501draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f98502gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, if1.iobyxmoadg notificationUiMapper) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(notificationUiMapper, "notificationUiMapper");
        this.f98500btonecajqb = notificationUiMapper;
        this.f98502gtknphoqwx = new draadjrbmk() { // from class: gf1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.notification.impl.presentation.iobyxmoadg.sopmlzcsov(this.f37091zdlpuopuiu, (State) obj);
            }
        };
        this.f98501draadjrbmk = new draadjrbmk() { // from class: gf1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.notification.impl.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.proloyalty.notification.impl.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.proloyalty.notification.impl.presentation.store.wkgbmnqykc ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        ru.myspar.proloyalty.notification.impl.presentation.store.wkgbmnqykc zoijcleaowVar2;
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.iobyxmoadg.f98552iobyxmoadg)) {
            return ru.myspar.proloyalty.notification.impl.presentation.store.wkgbmnqykc.iobyxmoadg.f98543iobyxmoadg;
        }
        if (zoijcleaowVar instanceof zoijcleaow.C2356zoijcleaow) {
            zoijcleaowVar2 = new ru.myspar.proloyalty.notification.impl.presentation.store.wkgbmnqykc.ppxfxbqfkf(jf1.zoijcleaow.iobyxmoadg(((zoijcleaow.C2356zoijcleaow) zoijcleaowVar).iobyxmoadg()));
        } else {
            if (!(zoijcleaowVar instanceof zoijcleaow.ppxfxbqfkf)) {
                throw new NoWhenBranchMatchedException();
            }
            zoijcleaow.ppxfxbqfkf ppxfxbqfkfVar = (zoijcleaow.ppxfxbqfkf) zoijcleaowVar;
            zoijcleaowVar2 = new ru.myspar.proloyalty.notification.impl.presentation.store.wkgbmnqykc.zoijcleaow(jf1.zoijcleaow.iobyxmoadg(ppxfxbqfkfVar.zoijcleaow()), ppxfxbqfkfVar.iobyxmoadg());
        }
        return zoijcleaowVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ppxfxbqfkf sopmlzcsov(iobyxmoadg iobyxmoadgVar, State state) {
        ppxfxbqfkf.iobyxmoadg zoijcleaowVar;
        zdlpuopuiu.btonecajqb(state, "<this>");
        State.Content content = state.getContent();
        if (zdlpuopuiu.eablkybsjg(content, State.Content.NonAuth.f98509zdlpuopuiu)) {
            zoijcleaowVar = ppxfxbqfkf.iobyxmoadg.C2354iobyxmoadg.f98504iobyxmoadg;
        } else if (content instanceof State.Content.Notifications) {
            Set<Map.Entry> setEntrySet = ((State.Content.Notifications) state.getContent()).getNotifications().entrySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap(gtknphoqwx.gxszxtbevo(tzroggbefp.eablkybsjg(jyumaefscl.cqumvgiudr(setEntrySet, 10)), 16));
            for (Map.Entry entry : setEntrySet) {
                b01.iobyxmoadg iobyxmoadgVar2 = (b01.iobyxmoadg) entry.getKey();
                State.NotificationTypeHolder notificationTypeHolder = (State.NotificationTypeHolder) entry.getValue();
                vdvldrhtss vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(jf1.zoijcleaow.zoijcleaow(iobyxmoadgVar2), new ppxfxbqfkf.zoijcleaow(notificationTypeHolder.getIsRefreshing(), iobyxmoadgVar.f98500btonecajqb.invoke(notificationTypeHolder.getItems(), iobyxmoadgVar2)));
                linkedHashMap.put(vdvldrhtssVarIobyxmoadg.lqeggnwhkg(), vdvldrhtssVarIobyxmoadg.nufgyqmvbu());
            }
            zoijcleaowVar = new ppxfxbqfkf.iobyxmoadg.zoijcleaow(linkedHashMap);
        } else {
            if (content != null) {
                throw new NoWhenBranchMatchedException();
            }
            zoijcleaowVar = null;
        }
        return new ppxfxbqfkf(zoijcleaowVar);
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f98502gtknphoqwx;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f98501draadjrbmk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof eablkybsjg.zoijcleaow) {
            eablkybsjg.zoijcleaow zoijcleaowVar = (eablkybsjg.zoijcleaow) eablkybsjgVar;
            Object objCllcsxoeiz = cllcsxoeiz(new wkgbmnqykc.iobyxmoadg(zoijcleaowVar.zoijcleaow(), zoijcleaowVar.iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof eablkybsjg.ppxfxbqfkf) {
            eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar = (eablkybsjg.ppxfxbqfkf) eablkybsjgVar;
            Object objCllcsxoeiz2 = cllcsxoeiz(new wkgbmnqykc.zoijcleaow(ppxfxbqfkfVar.iobyxmoadg().getTitle(), ppxfxbqfkfVar.iobyxmoadg().getBody(), ppxfxbqfkfVar.iobyxmoadg().getReference()), gxszxtbevoVar);
            return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.iobyxmoadg.f98513iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
