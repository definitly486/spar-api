package ru.myspar.proloyalty.notification.impl.presentation.store;

import gg.wwaezpbzkn;
import hg.jyumaefscl;
import hg.tzroggbefp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.push.NotificationModel;
import ru.myspar.proloyalty.notification.impl.presentation.store.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    private final State eablkybsjg(State state, b01.iobyxmoadg iobyxmoadgVar, State.NotificationTypeHolder notificationTypeHolder) {
        if (!(state.getContent() instanceof State.Content.Notifications)) {
            return state;
        }
        State.Content.Notifications notifications = (State.Content.Notifications) state.getContent();
        Map mapIwizpuwonk = tzroggbefp.iwizpuwonk(((State.Content.Notifications) state.getContent()).getNotifications());
        mapIwizpuwonk.put(iobyxmoadgVar, notificationTypeHolder);
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        return state.zoijcleaow(notifications.zoijcleaow(mapIwizpuwonk));
    }

    private final State gxszxtbevo(State state, b01.iobyxmoadg iobyxmoadgVar, draadjrbmk draadjrbmkVar) {
        if (!(state.getContent() instanceof State.Content.Notifications)) {
            return state;
        }
        State.Content.Notifications notifications = (State.Content.Notifications) state.getContent();
        Map mapIwizpuwonk = tzroggbefp.iwizpuwonk(((State.Content.Notifications) state.getContent()).getNotifications());
        State.NotificationTypeHolder notificationTypeHolder = (State.NotificationTypeHolder) mapIwizpuwonk.get(iobyxmoadgVar);
        if (notificationTypeHolder != null) {
            mapIwizpuwonk.put(iobyxmoadgVar, draadjrbmkVar.invoke(notificationTypeHolder));
        }
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        return state.zoijcleaow(notifications.zoijcleaow(mapIwizpuwonk));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State.NotificationTypeHolder wkgbmnqykc(State.NotificationTypeHolder updateNotification) {
        zdlpuopuiu.btonecajqb(updateNotification, "$this$updateNotification");
        return State.NotificationTypeHolder.ppxfxbqfkf(updateNotification, true, null, 2, null);
    }

    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.zoijcleaow) {
            return gxszxtbevo(state, ((gxszxtbevo.zoijcleaow) msg).iobyxmoadg(), new draadjrbmk() { // from class: kf1.iobyxmoadg
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return ru.myspar.proloyalty.notification.impl.presentation.store.zoijcleaow.wkgbmnqykc((State.NotificationTypeHolder) obj);
                }
            });
        }
        if (msg instanceof kf1.zoijcleaow) {
            return eablkybsjg(state, ((kf1.zoijcleaow) msg).iobyxmoadg(), new State.NotificationTypeHolder(false, jyumaefscl.wflxmlrfwp()));
        }
        if (!(msg instanceof kf1.ppxfxbqfkf)) {
            if (msg instanceof gxszxtbevo.iobyxmoadg) {
                return state.zoijcleaow(((gxszxtbevo.iobyxmoadg) msg).iobyxmoadg());
            }
            throw new NoWhenBranchMatchedException();
        }
        kf1.ppxfxbqfkf ppxfxbqfkfVar = (kf1.ppxfxbqfkf) msg;
        b01.iobyxmoadg iobyxmoadgVarZoijcleaow = ppxfxbqfkfVar.zoijcleaow();
        List listIobyxmoadg = ppxfxbqfkfVar.iobyxmoadg();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listIobyxmoadg) {
            if (hashSet.add(((NotificationModel) obj).getId())) {
                arrayList.add(obj);
            }
        }
        return eablkybsjg(state, iobyxmoadgVarZoijcleaow, new State.NotificationTypeHolder(false, arrayList));
    }
}
