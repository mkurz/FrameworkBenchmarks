<?php
\Ubiquity\cache\CacheManager::startProd($config);
\Ubiquity\orm\DAO::setModelsDatabases(["models\\Fortune"=>'pgsql',"models\\World"=>'pgsql']);
$workerServer->onWorkerStart=function() use($config){
	\Ubiquity\orm\DAO::startDatabase($config,'pgsql');
};

