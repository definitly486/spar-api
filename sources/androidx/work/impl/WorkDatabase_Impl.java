package androidx.work.impl;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import n5.zdlpuopuiu;
import p6.esjtqupxsv;
import p6.gtknphoqwx;
import p6.istkbnxepw;
import p6.jyumaefscl;
import p6.kcexrzcfyt;
import p6.ojitshcjhn;
import p6.oxmwwwfdhm;
import p6.rgvfuqvkyq;
import p6.zynmafqrjb;

/* JADX INFO: loaded from: classes2.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private volatile p6.eablkybsjg f13876iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private volatile oxmwwwfdhm f13877jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private volatile zynmafqrjb f13878kcexrzcfyt;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private volatile p6.zoijcleaow f13879oxmwwwfdhm;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private volatile jyumaefscl f13880vdvldrhtss;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private volatile ojitshcjhn f13881yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private volatile p6.btonecajqb f13882zdlpuopuiu;

    class iobyxmoadg extends zdlpuopuiu.zoijcleaow {
        iobyxmoadg(int i13) {
            super(i13);
        }

        @Override // n5.zdlpuopuiu.zoijcleaow
        public void eablkybsjg(u5.lqeggnwhkg lqeggnwhkgVar) {
        }

        @Override // n5.zdlpuopuiu.zoijcleaow
        public void gxszxtbevo(u5.lqeggnwhkg lqeggnwhkgVar) {
            p5.zoijcleaow.zoijcleaow(lqeggnwhkgVar);
        }

        @Override // n5.zdlpuopuiu.zoijcleaow
        public void iobyxmoadg(u5.lqeggnwhkg lqeggnwhkgVar) {
            lqeggnwhkgVar.lmojexxdyd("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            lqeggnwhkgVar.lmojexxdyd("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            lqeggnwhkgVar.lmojexxdyd("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            lqeggnwhkgVar.lmojexxdyd("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            lqeggnwhkgVar.lmojexxdyd("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            lqeggnwhkgVar.lmojexxdyd("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            lqeggnwhkgVar.lmojexxdyd("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            lqeggnwhkgVar.lmojexxdyd("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            lqeggnwhkgVar.lmojexxdyd("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            lqeggnwhkgVar.lmojexxdyd("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            lqeggnwhkgVar.lmojexxdyd("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            lqeggnwhkgVar.lmojexxdyd("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            lqeggnwhkgVar.lmojexxdyd("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            lqeggnwhkgVar.lmojexxdyd("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            lqeggnwhkgVar.lmojexxdyd("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
        }

        @Override // n5.zdlpuopuiu.zoijcleaow
        public zdlpuopuiu.ppxfxbqfkf lqeggnwhkg(u5.lqeggnwhkg lqeggnwhkgVar) {
            HashMap map = new HashMap(2);
            map.put("work_spec_id", new p5.gxszxtbevo.iobyxmoadg("work_spec_id", "TEXT", true, 1, null, 1));
            map.put("prerequisite_id", new p5.gxszxtbevo.iobyxmoadg("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new p5.gxszxtbevo.ppxfxbqfkf("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new p5.gxszxtbevo.ppxfxbqfkf("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new p5.gxszxtbevo.eablkybsjg("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            hashSet2.add(new p5.gxszxtbevo.eablkybsjg("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
            p5.gxszxtbevo gxszxtbevoVar = new p5.gxszxtbevo("Dependency", map, hashSet, hashSet2);
            p5.gxszxtbevo gxszxtbevoVarIobyxmoadg = p5.gxszxtbevo.iobyxmoadg(lqeggnwhkgVar, "Dependency");
            if (!gxszxtbevoVar.equals(gxszxtbevoVarIobyxmoadg)) {
                return new zdlpuopuiu.ppxfxbqfkf(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + gxszxtbevoVar + "\n Found:\n" + gxszxtbevoVarIobyxmoadg);
            }
            HashMap map2 = new HashMap(32);
            map2.put("id", new p5.gxszxtbevo.iobyxmoadg("id", "TEXT", true, 1, null, 1));
            map2.put("state", new p5.gxszxtbevo.iobyxmoadg("state", "INTEGER", true, 0, null, 1));
            map2.put("worker_class_name", new p5.gxszxtbevo.iobyxmoadg("worker_class_name", "TEXT", true, 0, null, 1));
            map2.put("input_merger_class_name", new p5.gxszxtbevo.iobyxmoadg("input_merger_class_name", "TEXT", true, 0, null, 1));
            map2.put("input", new p5.gxszxtbevo.iobyxmoadg("input", "BLOB", true, 0, null, 1));
            map2.put("output", new p5.gxszxtbevo.iobyxmoadg("output", "BLOB", true, 0, null, 1));
            map2.put("initial_delay", new p5.gxszxtbevo.iobyxmoadg("initial_delay", "INTEGER", true, 0, null, 1));
            map2.put("interval_duration", new p5.gxszxtbevo.iobyxmoadg("interval_duration", "INTEGER", true, 0, null, 1));
            map2.put("flex_duration", new p5.gxszxtbevo.iobyxmoadg("flex_duration", "INTEGER", true, 0, null, 1));
            map2.put("run_attempt_count", new p5.gxszxtbevo.iobyxmoadg("run_attempt_count", "INTEGER", true, 0, null, 1));
            map2.put("backoff_policy", new p5.gxszxtbevo.iobyxmoadg("backoff_policy", "INTEGER", true, 0, null, 1));
            map2.put("backoff_delay_duration", new p5.gxszxtbevo.iobyxmoadg("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            map2.put("last_enqueue_time", new p5.gxszxtbevo.iobyxmoadg("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
            map2.put("minimum_retention_duration", new p5.gxszxtbevo.iobyxmoadg("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            map2.put("schedule_requested_at", new p5.gxszxtbevo.iobyxmoadg("schedule_requested_at", "INTEGER", true, 0, null, 1));
            map2.put("run_in_foreground", new p5.gxszxtbevo.iobyxmoadg("run_in_foreground", "INTEGER", true, 0, null, 1));
            map2.put("out_of_quota_policy", new p5.gxszxtbevo.iobyxmoadg("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            map2.put("period_count", new p5.gxszxtbevo.iobyxmoadg("period_count", "INTEGER", true, 0, CommonUrlParts.Values.FALSE_INTEGER, 1));
            map2.put("generation", new p5.gxszxtbevo.iobyxmoadg("generation", "INTEGER", true, 0, CommonUrlParts.Values.FALSE_INTEGER, 1));
            map2.put("next_schedule_time_override", new p5.gxszxtbevo.iobyxmoadg("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
            map2.put("next_schedule_time_override_generation", new p5.gxszxtbevo.iobyxmoadg("next_schedule_time_override_generation", "INTEGER", true, 0, CommonUrlParts.Values.FALSE_INTEGER, 1));
            map2.put("stop_reason", new p5.gxszxtbevo.iobyxmoadg("stop_reason", "INTEGER", true, 0, "-256", 1));
            map2.put("trace_tag", new p5.gxszxtbevo.iobyxmoadg("trace_tag", "TEXT", false, 0, null, 1));
            map2.put("required_network_type", new p5.gxszxtbevo.iobyxmoadg("required_network_type", "INTEGER", true, 0, null, 1));
            map2.put("required_network_request", new p5.gxszxtbevo.iobyxmoadg("required_network_request", "BLOB", true, 0, "x''", 1));
            map2.put("requires_charging", new p5.gxszxtbevo.iobyxmoadg("requires_charging", "INTEGER", true, 0, null, 1));
            map2.put("requires_device_idle", new p5.gxszxtbevo.iobyxmoadg("requires_device_idle", "INTEGER", true, 0, null, 1));
            map2.put("requires_battery_not_low", new p5.gxszxtbevo.iobyxmoadg("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            map2.put("requires_storage_not_low", new p5.gxszxtbevo.iobyxmoadg("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            map2.put("trigger_content_update_delay", new p5.gxszxtbevo.iobyxmoadg("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            map2.put("trigger_max_content_delay", new p5.gxszxtbevo.iobyxmoadg("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            map2.put("content_uri_triggers", new p5.gxszxtbevo.iobyxmoadg("content_uri_triggers", "BLOB", true, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new p5.gxszxtbevo.eablkybsjg("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
            hashSet4.add(new p5.gxszxtbevo.eablkybsjg("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
            p5.gxszxtbevo gxszxtbevoVar2 = new p5.gxszxtbevo("WorkSpec", map2, hashSet3, hashSet4);
            p5.gxszxtbevo gxszxtbevoVarIobyxmoadg2 = p5.gxszxtbevo.iobyxmoadg(lqeggnwhkgVar, "WorkSpec");
            if (!gxszxtbevoVar2.equals(gxszxtbevoVarIobyxmoadg2)) {
                return new zdlpuopuiu.ppxfxbqfkf(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + gxszxtbevoVar2 + "\n Found:\n" + gxszxtbevoVarIobyxmoadg2);
            }
            HashMap map3 = new HashMap(2);
            map3.put("tag", new p5.gxszxtbevo.iobyxmoadg("tag", "TEXT", true, 1, null, 1));
            map3.put("work_spec_id", new p5.gxszxtbevo.iobyxmoadg("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new p5.gxszxtbevo.ppxfxbqfkf("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new p5.gxszxtbevo.eablkybsjg("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            p5.gxszxtbevo gxszxtbevoVar3 = new p5.gxszxtbevo("WorkTag", map3, hashSet5, hashSet6);
            p5.gxszxtbevo gxszxtbevoVarIobyxmoadg3 = p5.gxszxtbevo.iobyxmoadg(lqeggnwhkgVar, "WorkTag");
            if (!gxszxtbevoVar3.equals(gxszxtbevoVarIobyxmoadg3)) {
                return new zdlpuopuiu.ppxfxbqfkf(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + gxszxtbevoVar3 + "\n Found:\n" + gxszxtbevoVarIobyxmoadg3);
            }
            HashMap map4 = new HashMap(3);
            map4.put("work_spec_id", new p5.gxszxtbevo.iobyxmoadg("work_spec_id", "TEXT", true, 1, null, 1));
            map4.put("generation", new p5.gxszxtbevo.iobyxmoadg("generation", "INTEGER", true, 2, CommonUrlParts.Values.FALSE_INTEGER, 1));
            map4.put("system_id", new p5.gxszxtbevo.iobyxmoadg("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new p5.gxszxtbevo.ppxfxbqfkf("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            p5.gxszxtbevo gxszxtbevoVar4 = new p5.gxszxtbevo("SystemIdInfo", map4, hashSet7, new HashSet(0));
            p5.gxszxtbevo gxszxtbevoVarIobyxmoadg4 = p5.gxszxtbevo.iobyxmoadg(lqeggnwhkgVar, "SystemIdInfo");
            if (!gxszxtbevoVar4.equals(gxszxtbevoVarIobyxmoadg4)) {
                return new zdlpuopuiu.ppxfxbqfkf(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + gxszxtbevoVar4 + "\n Found:\n" + gxszxtbevoVarIobyxmoadg4);
            }
            HashMap map5 = new HashMap(2);
            map5.put(ExternalMetricsManagerImpl.NAME, new p5.gxszxtbevo.iobyxmoadg(ExternalMetricsManagerImpl.NAME, "TEXT", true, 1, null, 1));
            map5.put("work_spec_id", new p5.gxszxtbevo.iobyxmoadg("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new p5.gxszxtbevo.ppxfxbqfkf("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new p5.gxszxtbevo.eablkybsjg("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            p5.gxszxtbevo gxszxtbevoVar5 = new p5.gxszxtbevo("WorkName", map5, hashSet8, hashSet9);
            p5.gxszxtbevo gxszxtbevoVarIobyxmoadg5 = p5.gxszxtbevo.iobyxmoadg(lqeggnwhkgVar, "WorkName");
            if (!gxszxtbevoVar5.equals(gxszxtbevoVarIobyxmoadg5)) {
                return new zdlpuopuiu.ppxfxbqfkf(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + gxszxtbevoVar5 + "\n Found:\n" + gxszxtbevoVarIobyxmoadg5);
            }
            HashMap map6 = new HashMap(2);
            map6.put("work_spec_id", new p5.gxszxtbevo.iobyxmoadg("work_spec_id", "TEXT", true, 1, null, 1));
            map6.put("progress", new p5.gxszxtbevo.iobyxmoadg("progress", "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new p5.gxszxtbevo.ppxfxbqfkf("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            p5.gxszxtbevo gxszxtbevoVar6 = new p5.gxszxtbevo("WorkProgress", map6, hashSet10, new HashSet(0));
            p5.gxszxtbevo gxszxtbevoVarIobyxmoadg6 = p5.gxszxtbevo.iobyxmoadg(lqeggnwhkgVar, "WorkProgress");
            if (!gxszxtbevoVar6.equals(gxszxtbevoVarIobyxmoadg6)) {
                return new zdlpuopuiu.ppxfxbqfkf(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + gxszxtbevoVar6 + "\n Found:\n" + gxszxtbevoVarIobyxmoadg6);
            }
            HashMap map7 = new HashMap(2);
            map7.put("key", new p5.gxszxtbevo.iobyxmoadg("key", "TEXT", true, 1, null, 1));
            map7.put("long_value", new p5.gxszxtbevo.iobyxmoadg("long_value", "INTEGER", false, 0, null, 1));
            p5.gxszxtbevo gxszxtbevoVar7 = new p5.gxszxtbevo("Preference", map7, new HashSet(0), new HashSet(0));
            p5.gxszxtbevo gxszxtbevoVarIobyxmoadg7 = p5.gxszxtbevo.iobyxmoadg(lqeggnwhkgVar, "Preference");
            if (gxszxtbevoVar7.equals(gxszxtbevoVarIobyxmoadg7)) {
                return new zdlpuopuiu.ppxfxbqfkf(true, null);
            }
            return new zdlpuopuiu.ppxfxbqfkf(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + gxszxtbevoVar7 + "\n Found:\n" + gxszxtbevoVarIobyxmoadg7);
        }

        @Override // n5.zdlpuopuiu.zoijcleaow
        public void ppxfxbqfkf(u5.lqeggnwhkg lqeggnwhkgVar) {
            List list = ((n5.oxmwwwfdhm) WorkDatabase_Impl.this).f68847nufgyqmvbu;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((n5.oxmwwwfdhm.zoijcleaow) it.next()).iobyxmoadg(lqeggnwhkgVar);
                }
            }
        }

        @Override // n5.zdlpuopuiu.zoijcleaow
        public void wkgbmnqykc(u5.lqeggnwhkg lqeggnwhkgVar) {
            ((n5.oxmwwwfdhm) WorkDatabase_Impl.this).f68845iobyxmoadg = lqeggnwhkgVar;
            lqeggnwhkgVar.lmojexxdyd("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.wwaezpbzkn(lqeggnwhkgVar);
            List list = ((n5.oxmwwwfdhm) WorkDatabase_Impl.this).f68847nufgyqmvbu;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((n5.oxmwwwfdhm.zoijcleaow) it.next()).ppxfxbqfkf(lqeggnwhkgVar);
                }
            }
        }

        @Override // n5.zdlpuopuiu.zoijcleaow
        public void zoijcleaow(u5.lqeggnwhkg lqeggnwhkgVar) {
            lqeggnwhkgVar.lmojexxdyd("DROP TABLE IF EXISTS `Dependency`");
            lqeggnwhkgVar.lmojexxdyd("DROP TABLE IF EXISTS `WorkSpec`");
            lqeggnwhkgVar.lmojexxdyd("DROP TABLE IF EXISTS `WorkTag`");
            lqeggnwhkgVar.lmojexxdyd("DROP TABLE IF EXISTS `SystemIdInfo`");
            lqeggnwhkgVar.lmojexxdyd("DROP TABLE IF EXISTS `WorkName`");
            lqeggnwhkgVar.lmojexxdyd("DROP TABLE IF EXISTS `WorkProgress`");
            lqeggnwhkgVar.lmojexxdyd("DROP TABLE IF EXISTS `Preference`");
            List list = ((n5.oxmwwwfdhm) WorkDatabase_Impl.this).f68847nufgyqmvbu;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((n5.oxmwwwfdhm.zoijcleaow) it.next()).zoijcleaow(lqeggnwhkgVar);
                }
            }
        }
    }

    @Override // androidx.work.impl.WorkDatabase
    public p6.eablkybsjg kegysxyocb() {
        p6.eablkybsjg eablkybsjgVar;
        if (this.f13876iwizpuwonk != null) {
            return this.f13876iwizpuwonk;
        }
        synchronized (this) {
            try {
                if (this.f13876iwizpuwonk == null) {
                    this.f13876iwizpuwonk = new p6.gxszxtbevo(this);
                }
                eablkybsjgVar = this.f13876iwizpuwonk;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eablkybsjgVar;
    }

    @Override // n5.oxmwwwfdhm
    public Set lereixgezr() {
        return new HashSet();
    }

    @Override // androidx.work.impl.WorkDatabase
    public ojitshcjhn mbcevpiqjq() {
        ojitshcjhn ojitshcjhnVar;
        if (this.f13881yggfygwlhe != null) {
            return this.f13881yggfygwlhe;
        }
        synchronized (this) {
            try {
                if (this.f13881yggfygwlhe == null) {
                    this.f13881yggfygwlhe = new rgvfuqvkyq(this);
                }
                ojitshcjhnVar = this.f13881yggfygwlhe;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ojitshcjhnVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public oxmwwwfdhm ntlheqmsrt() {
        oxmwwwfdhm oxmwwwfdhmVar;
        if (this.f13877jyumaefscl != null) {
            return this.f13877jyumaefscl;
        }
        synchronized (this) {
            try {
                if (this.f13877jyumaefscl == null) {
                    this.f13877jyumaefscl = new kcexrzcfyt(this);
                }
                oxmwwwfdhmVar = this.f13877jyumaefscl;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return oxmwwwfdhmVar;
    }

    @Override // n5.oxmwwwfdhm
    protected u5.nufgyqmvbu oxmwwwfdhm(n5.lqeggnwhkg lqeggnwhkgVar) {
        return lqeggnwhkgVar.f68830ppxfxbqfkf.iobyxmoadg(u5.nufgyqmvbu.zoijcleaow.iobyxmoadg(lqeggnwhkgVar.f68824iobyxmoadg).wkgbmnqykc(lqeggnwhkgVar.f68835zoijcleaow).ppxfxbqfkf(new zdlpuopuiu(lqeggnwhkgVar, new iobyxmoadg(23), "86254750241babac4b8d52996a675549", "1cbd3130fa23b59692c061c594c16cc0")).zoijcleaow());
    }

    @Override // n5.oxmwwwfdhm
    protected Map pmvmpeiblj() {
        HashMap map = new HashMap();
        map.put(jyumaefscl.class, esjtqupxsv.hcddaimhww());
        map.put(p6.zoijcleaow.class, p6.ppxfxbqfkf.eablkybsjg());
        map.put(zynmafqrjb.class, istkbnxepw.eablkybsjg());
        map.put(p6.btonecajqb.class, gtknphoqwx.nufgyqmvbu());
        map.put(ojitshcjhn.class, rgvfuqvkyq.ppxfxbqfkf());
        map.put(oxmwwwfdhm.class, kcexrzcfyt.wkgbmnqykc());
        map.put(p6.eablkybsjg.class, p6.gxszxtbevo.ppxfxbqfkf());
        map.put(p6.lqeggnwhkg.class, p6.nufgyqmvbu.iobyxmoadg());
        return map;
    }

    @Override // androidx.work.impl.WorkDatabase
    public zynmafqrjb sopmlzcsov() {
        zynmafqrjb zynmafqrjbVar;
        if (this.f13878kcexrzcfyt != null) {
            return this.f13878kcexrzcfyt;
        }
        synchronized (this) {
            try {
                if (this.f13878kcexrzcfyt == null) {
                    this.f13878kcexrzcfyt = new istkbnxepw(this);
                }
                zynmafqrjbVar = this.f13878kcexrzcfyt;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zynmafqrjbVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public p6.zoijcleaow stevsuqkhv() {
        p6.zoijcleaow zoijcleaowVar;
        if (this.f13879oxmwwwfdhm != null) {
            return this.f13879oxmwwwfdhm;
        }
        synchronized (this) {
            try {
                if (this.f13879oxmwwwfdhm == null) {
                    this.f13879oxmwwwfdhm = new p6.ppxfxbqfkf(this);
                }
                zoijcleaowVar = this.f13879oxmwwwfdhm;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zoijcleaowVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public p6.btonecajqb tzroggbefp() {
        p6.btonecajqb btonecajqbVar;
        if (this.f13882zdlpuopuiu != null) {
            return this.f13882zdlpuopuiu;
        }
        synchronized (this) {
            try {
                if (this.f13882zdlpuopuiu == null) {
                    this.f13882zdlpuopuiu = new gtknphoqwx(this);
                }
                btonecajqbVar = this.f13882zdlpuopuiu;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return btonecajqbVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public jyumaefscl ulzqkzuiru() {
        jyumaefscl jyumaefsclVar;
        if (this.f13880vdvldrhtss != null) {
            return this.f13880vdvldrhtss;
        }
        synchronized (this) {
            try {
                if (this.f13880vdvldrhtss == null) {
                    this.f13880vdvldrhtss = new esjtqupxsv(this);
                }
                jyumaefsclVar = this.f13880vdvldrhtss;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jyumaefsclVar;
    }

    @Override // n5.oxmwwwfdhm
    protected androidx.room.wkgbmnqykc vdvldrhtss() {
        return new androidx.room.wkgbmnqykc(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // n5.oxmwwwfdhm
    public List zdlpuopuiu(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zoijcleaow());
        arrayList.add(new ppxfxbqfkf());
        arrayList.add(new wkgbmnqykc());
        arrayList.add(new eablkybsjg());
        arrayList.add(new gxszxtbevo());
        arrayList.add(new lqeggnwhkg());
        arrayList.add(new nufgyqmvbu());
        arrayList.add(new dxjokdxxww());
        return arrayList;
    }
}
