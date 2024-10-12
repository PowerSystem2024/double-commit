import { DBKEY, DBURL } from '@/components/constants.vue'
import { createClient } from '@supabase/supabase-js'

export const supabase = createClient(DBURL, DBKEY)
