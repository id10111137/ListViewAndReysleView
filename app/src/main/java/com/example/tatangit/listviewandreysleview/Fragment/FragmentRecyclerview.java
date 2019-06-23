package com.example.tatangit.listviewandreysleview.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tatangit.listviewandreysleview.Adapter.Adapter_Example_ListView;
import com.example.tatangit.listviewandreysleview.Adapter.Adapter_Example_ReysleView;
import com.example.tatangit.listviewandreysleview.Model.Model_Example;
import com.example.tatangit.listviewandreysleview.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FragmentRecyclerview extends Fragment {

    View root;
    ArrayList<Model_Example> model_examples;
    Adapter_Example_ReysleView adapter_example_reysleView;

    @BindView(R.id.IdRecyclerView)
    RecyclerView IdRecyclerView;


    public FragmentRecyclerview() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_recyclerview, container, false);
        ButterKnife.bind(this, root);
        DummyData();
        adapter_example_reysleView = new Adapter_Example_ReysleView(model_examples, getContext());
        IdRecyclerView.setHasFixedSize(true);
        IdRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        IdRecyclerView.setItemAnimator(new DefaultItemAnimator());
        IdRecyclerView.setAdapter(adapter_example_reysleView);
        return root;
    }

    private void DummyData() {
        model_examples = new ArrayList<>();
        model_examples.add(new Model_Example("Umroh Satu", "https://1.bp.blogspot.com/-wpOgGPmLaJE/WB17tTTthLI/AAAAAAAAAp0/7VvbjdhVrt8hNDEuvIx_bZ_kau1Ti5OhQCLcB/s1600/Wallpaper%2BMasjidil%2BHaram%2Buntuk%2Bandroid.jpg", "Pt. Solusa", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s", "Close", "2018-09", "2018-06", "10", "Manasik"));
        model_examples.add(new Model_Example("Umroh Dua", "https://1.bp.blogspot.com/-wpOgGPmLaJE/WB17tTTthLI/AAAAAAAAAp0/7VvbjdhVrt8hNDEuvIx_bZ_kau1Ti5OhQCLcB/s1600/Wallpaper%2BMasjidil%2BHaram%2Buntuk%2Bandroid.jpg", "Pt. Manogomi", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s", "Close", "2018-09", "2018-06", "05", "-"));
        model_examples.add(new Model_Example("Umroh Tiga", "https://1.bp.blogspot.com/-wpOgGPmLaJE/WB17tTTthLI/AAAAAAAAAp0/7VvbjdhVrt8hNDEuvIx_bZ_kau1Ti5OhQCLcB/s1600/Wallpaper%2BMasjidil%2BHaram%2Buntuk%2Bandroid.jpg", "Pt. Kerta", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s", "Close", "2018-09", "2018-06", "1", "Manasik"));
        model_examples.add(new Model_Example("Umroh Empat", "https://1.bp.blogspot.com/-wpOgGPmLaJE/WB17tTTthLI/AAAAAAAAAp0/7VvbjdhVrt8hNDEuvIx_bZ_kau1Ti5OhQCLcB/s1600/Wallpaper%2BMasjidil%2BHaram%2Buntuk%2Bandroid.jpg", "Pt. Yasa", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s", "Close", "2018-09", "2018-06", "10", "-"));
        model_examples.add(new Model_Example("Umroh Lima", "https://1.bp.blogspot.com/-wpOgGPmLaJE/WB17tTTthLI/AAAAAAAAAp0/7VvbjdhVrt8hNDEuvIx_bZ_kau1Ti5OhQCLcB/s1600/Wallpaper%2BMasjidil%2BHaram%2Buntuk%2Bandroid.jpg", "Pt. Denma", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s", "Close", "2018-09", "2018-06", "20", "Manasik"));
        model_examples.add(new Model_Example("Umroh Enam", "https://1.bp.blogspot.com/-wpOgGPmLaJE/WB17tTTthLI/AAAAAAAAAp0/7VvbjdhVrt8hNDEuvIx_bZ_kau1Ti5OhQCLcB/s1600/Wallpaper%2BMasjidil%2BHaram%2Buntuk%2Bandroid.jpg", "Pt. Samsu", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s", "Close", "2018-09", "2018-06", "50", "-"));
    }
}
