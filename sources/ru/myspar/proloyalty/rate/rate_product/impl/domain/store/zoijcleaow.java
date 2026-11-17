package ru.myspar.proloyalty.rate.rate_product.impl.domain.store;

import j0.l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.zoijcleaow) {
            return State.ppxfxbqfkf(state, null, new State.Content.Error(false, ((gxszxtbevo.zoijcleaow) msg).iobyxmoadg()), null, 5, null);
        }
        if (zdlpuopuiu.eablkybsjg(msg, gxszxtbevo.dxjokdxxww.f100253iobyxmoadg)) {
            State.Content content = state.getContent();
            if (content instanceof State.Content.Error) {
                content = State.Content.Error.ppxfxbqfkf((State.Content.Error) content, true, null, 2, null);
            }
            return State.ppxfxbqfkf(state, null, content, null, 5, null);
        }
        if (zdlpuopuiu.eablkybsjg(msg, gxszxtbevo.wkgbmnqykc.f100261iobyxmoadg)) {
            State.Content content2 = state.getContent();
            if (content2 instanceof State.Content.Error) {
                content2 = State.Content.Error.ppxfxbqfkf((State.Content.Error) content2, false, null, 2, null);
            }
            return State.ppxfxbqfkf(state, null, content2, null, 5, null);
        }
        if (zdlpuopuiu.eablkybsjg(msg, gxszxtbevo.btonecajqb.f100252iobyxmoadg)) {
            State.Content content3 = state.getContent();
            if (content3 instanceof State.Content.Product) {
                content3 = State.Content.Product.ppxfxbqfkf((State.Content.Product) content3, null, null, null, null, 0, true, 31, null);
            }
            return State.ppxfxbqfkf(state, null, content3, null, 5, null);
        }
        if (msg instanceof gxszxtbevo.eablkybsjg) {
            State.Content content4 = state.getContent();
            if (content4 instanceof State.Content.Product) {
                content4 = State.Content.Product.ppxfxbqfkf((State.Content.Product) content4, null, null, null, null, 0, false, 31, null);
            }
            return State.ppxfxbqfkf(state, null, content4, new State.Message.Error.Send(((gxszxtbevo.eablkybsjg) msg).iobyxmoadg()), 1, null);
        }
        if (msg instanceof gxszxtbevo.C2405gxszxtbevo) {
            gxszxtbevo.C2405gxszxtbevo c2405gxszxtbevo = (gxszxtbevo.C2405gxszxtbevo) msg;
            String productArticle = c2405gxszxtbevo.iobyxmoadg().getProductArticle();
            String productName = c2405gxszxtbevo.iobyxmoadg().getProductName();
            String imageUrl = c2405gxszxtbevo.iobyxmoadg().getImageUrl();
            if (imageUrl == null) {
                imageUrl = "";
            }
            return State.ppxfxbqfkf(state, null, new State.Content.Product(productArticle, productName, imageUrl, new tzroggbefp(c2405gxszxtbevo.iobyxmoadg().getReview().getComment(), 0L, (l) null, 6, (gtknphoqwx) null), c2405gxszxtbevo.iobyxmoadg().getReview().getRating(), false, null), null, 5, null);
        }
        if (msg instanceof gxszxtbevo.lqeggnwhkg) {
            State.Content content5 = state.getContent();
            return State.ppxfxbqfkf(state, null, content5 instanceof State.Content.Product ? State.Content.Product.ppxfxbqfkf((State.Content.Product) content5, null, null, null, ((gxszxtbevo.lqeggnwhkg) msg).iobyxmoadg(), 0, false, 55, null) : content5, null, 5, null);
        }
        if (msg instanceof gxszxtbevo.nufgyqmvbu) {
            State.Content content6 = state.getContent();
            return State.ppxfxbqfkf(state, null, content6 instanceof State.Content.Product ? State.Content.Product.ppxfxbqfkf((State.Content.Product) content6, null, null, null, null, ((gxszxtbevo.nufgyqmvbu) msg).iobyxmoadg(), false, 47, null) : content6, null, 5, null);
        }
        if (msg instanceof gxszxtbevo.ppxfxbqfkf) {
            return State.ppxfxbqfkf(state, null, null, new State.Message.Error.Init(((gxszxtbevo.ppxfxbqfkf) msg).iobyxmoadg()), 3, null);
        }
        if (!(msg instanceof gxszxtbevo.gtknphoqwx)) {
            if (zdlpuopuiu.eablkybsjg(msg, gxszxtbevo.iobyxmoadg.f100257iobyxmoadg)) {
                return State.ppxfxbqfkf(state, null, null, null, 3, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        State.Message.Success success = new State.Message.Success(((gxszxtbevo.gtknphoqwx) msg).iobyxmoadg());
        State.Content content7 = state.getContent();
        if (content7 instanceof State.Content.Product) {
            content7 = State.Content.Product.ppxfxbqfkf((State.Content.Product) content7, null, null, null, null, 0, false, 31, null);
        }
        return State.ppxfxbqfkf(state, null, content7, success, 1, null);
    }
}
