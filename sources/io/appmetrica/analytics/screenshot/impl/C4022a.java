package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity$ScreenCaptureCallback;
import io.appmetrica.analytics.screenshot.impl.C4022a;
import kotlin.jvm.internal.jyumaefscl;
import tg.iobyxmoadg;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4022a extends jyumaefscl implements iobyxmoadg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4025d f48965a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4022a(C4025d c4025d) {
        super(0);
        this.f48965a = c4025d;
    }

    public static final void a(C4025d c4025d) {
        ((C4042v) c4025d.f48972b).a("AndroidApiScreenshotCaptor");
    }

    @Override // tg.iobyxmoadg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Activity$ScreenCaptureCallback invoke() {
        final C4025d c4025d = this.f48965a;
        return new Activity$ScreenCaptureCallback() { // from class: dg.iobyxmoadg
            public final void onScreenCaptured() {
                C4022a.a(c4025d);
            }
        };
    }
}
