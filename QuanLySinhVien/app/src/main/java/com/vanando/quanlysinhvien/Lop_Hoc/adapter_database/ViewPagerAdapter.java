package com.vanando.quanlysinhvien.Lop_Hoc.adapter_database;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.vanando.quanlysinhvien.Lop_Hoc.fragment.FragmentLop;
import com.vanando.quanlysinhvien.Lop_Hoc.fragment.FragmentTKB;

/**
 * Created by Admin on 4/20/2018.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment frag = null;
        switch (position) {
            case 0:
                frag = FragmentLop.newIntance();
                break;
            case 1:
                frag = FragmentTKB.newIntance();
                break;
        }
        return frag;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        switch (position) {
            case 0:
                return "Danh sách lớp";
            case 1:
                return "Thời khóa biểu";
        }
        return title;
    }
}