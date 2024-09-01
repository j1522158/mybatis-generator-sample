package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.mbgenerator_test.mbgenerator.mappergen.ItemMapper;
import com.example.mbgenerator_test.mbgenerator.modelgen.Item;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

@Controller
@RequestMapping()
public class TestController {
	
	// ロガークラス
	private static final Logger logger = 
			LoggerFactory.getLogger(TestController.class);

	// itemテーブルの内容を保持するマッパー
	@Autowired
	private ItemMapper itemMapper;
	  
	/**
	 * indexパスにアクセスしたときに呼ばれるメソッド
	 * index.htmlを表示する
	 * http://localhost:8080/indexにアクセスする
	 * @param model
	 * @return
	 */
    @GetMapping("/index")
    public String index(Model model) {
    	try {
    		logger.info("itemテーブル取得処理を開始します。");
    		// すべてのアイテムを取得
    		List<Item> items = itemMapper.select(c -> c);
        
    		// 特定の条件でアイテムを取得する例（価格が1000以上のアイテム）
    		// List<Item> expensiveItems = itemMapper.select(c -> 
    		//     c.where(ItemDynamicSqlSupport.price, isGreaterThanOrEqualTo(1000)));
    		
    		// 取得した情報をModelに追加
    		// ※Thymeleafのテンプレート機能を使って画面に表示する
    		model.addAttribute("items", items);
    		logger.info("itemテーブル取得処理を終了します。");
    	// ※実際には例外に応じて細かく処理を分けることが多いです。
    	} catch (Exception e) {
    		
    		// エラーログを出力
    		logger.error("アイテム取得中にエラーが発生しました", e);

    		// エラーメッセージをModelに追加
    		model.addAttribute("errorMessage", "アイテムの取得に失敗しました。");
    		throw e;
    }
        return "index";
    }
}
